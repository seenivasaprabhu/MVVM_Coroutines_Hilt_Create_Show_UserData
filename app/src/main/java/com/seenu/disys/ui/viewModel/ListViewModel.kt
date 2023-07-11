package com.seenu.disys.ui.viewModel

import androidx.lifecycle.ViewModel
import com.seenu.disys.data.entities.Data
import com.seenu.disys.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//Viewmodel using Hilt
@HiltViewModel
class ViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
	// get the record fom database
    fun getRecord() = repository.getRecords()
    // post method to create a record
    fun postRecord(data: Data) = repository.postRecords(data)
}