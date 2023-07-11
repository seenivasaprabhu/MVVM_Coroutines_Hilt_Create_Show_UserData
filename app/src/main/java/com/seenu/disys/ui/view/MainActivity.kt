package com.seenu.disys.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import com.seenu.disys.R
import com.seenu.disys.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.ui.setupWithNavController

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
	//init layout binding
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

	//init navFragment
        val navHostFragment: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
	//init navController
        val navController: NavController = navHostFragment.navController
	//init appbar
        val appBarConfiguration: AppBarConfiguration = AppBarConfiguration(navController.graph)
	//binding navController
        binding.toolbar.setupWithNavController(navController, appBarConfiguration)


    }
}
