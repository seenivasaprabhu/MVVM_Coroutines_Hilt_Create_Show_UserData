package com.seenu.disys.ui.view

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.seenu.disys.R
import com.seenu.disys.data.entities.Data
import com.seenu.disys.databinding.FragmentListBinding
import com.seenu.disys.ui.viewModel.ViewModel
import com.seenu.disys.utils.NetworkMoniter
import com.seenu.disys.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlin.system.exitProcess

//Fragment class for Records
@AndroidEntryPoint
class Fragment() : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: Adapter
    private lateinit var viewModel: ViewModel
    private lateinit var connectionLiveData: NetworkMoniter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //init layout binding
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //init viewmodel
        viewModel = ViewModelProvider(this)[ViewModel::class.java]
        //init recyclerview
        setupRecyclerView()
        //network moniter
        networkListener()
        //back click
        backListener()

    }

    // function for init recycler adapter
    private fun setupRecyclerView() {
        adapter = Adapter(context)
        binding.rvRecord.layoutManager = LinearLayoutManager(requireContext())
        binding.rvRecord.adapter = adapter
    }

    //function for network monitor
    private fun networkListener() {
        //Network Monitor
        connectionLiveData = NetworkMoniter(requireContext())
        connectionLiveData.observe(viewLifecycleOwner) { isNetworkAvailable ->

            binding.networkstatus = isNetworkAvailable

            isNetworkAvailable?.let {
                setupObservers()
            }
        }
    }

    //function click listener
    private fun backListener() {
        //back click listener
        binding.imageButton.setOnClickListener {
            //Alert dialog for exit
            val builder = AlertDialog.Builder(context)
            builder.setTitle("Are you want to close app?")
            builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                exitProcess(-1)
            }
            builder.setNegativeButton(android.R.string.no) { dialog, which ->

            }

            builder.show()
        }

        binding.addButton.setOnClickListener {
            showCreateUserDialog(requireActivity())
        }

    }

    //  function to observe response from database response
    private fun setupObservers() {
        viewModel.getRecord().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { data -> adapter.setItems(data) }
                }
                Resource.Status.ERROR ->
                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()

                Resource.Status.LOADING ->
                    binding.progressBar.visibility = View.VISIBLE
            }
        })


    }

    fun showCreateUserDialog(activity: Activity?) {
        val dialog = Dialog(activity!!)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)

        dialog.setContentView(R.layout.fragment_create_user)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val submitBtn = dialog.findViewById<Button>(R.id.button1)
        val employeeId = dialog.findViewById<EditText>(R.id.editText)
        val name = dialog.findViewById<EditText>(R.id.editText2)
        val email = dialog.findViewById<EditText>(R.id.editText3)
        val gender = dialog.findViewById<RadioGroup>(R.id.gender_layout)
        var genderString = "male"
        var statusString = "active"
        val status = dialog.findViewById<RadioGroup>(R.id.status_layout)
        gender.setOnCheckedChangeListener { group, checkedId ->
            val genderRadioButton = group.findViewById<RadioButton>(checkedId)
            genderString = genderRadioButton.text.toString()
        }
        status.setOnCheckedChangeListener { group, checkedId ->
            val statusRadioButton = group.findViewById<RadioButton>(checkedId)
            statusString = statusRadioButton.text.toString()
        }
        submitBtn.setOnClickListener {

            if (email.text.toString()
                    .isNotEmpty() && genderString.isNotEmpty() && employeeId.text.toString()
                    .isNotEmpty() && name.text.toString().isNotEmpty() && statusString.isNotEmpty()){
                val data = Data(
                    email.text.toString(),
                    genderString,
                    employeeId.text.toString().toInt(),
                    name.text.toString(),
                    statusString
                )
                //add user post method call
                viewModel.postRecord(data).observe(viewLifecycleOwner, Observer {
                    when (it.status) {
                        Resource.Status.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            dialog.dismiss()
                            setupObservers()

                        }
                        Resource.Status.ERROR ->{
                            binding.progressBar.visibility = View.GONE
                            dialog.dismiss()
                            Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                        }
                        Resource.Status.LOADING ->
                            binding.progressBar.visibility = View.VISIBLE
                    }
                })
            }
            else{
                Toast.makeText(getActivity(), "Please enter all details", Toast.LENGTH_SHORT).show()
            }
        }
        dialog.show()
    }
}