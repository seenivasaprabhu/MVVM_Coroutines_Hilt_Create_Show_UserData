package com.seenu.disys.data.remote

import com.seenu.disys.data.entities.Data
import javax.inject.Inject

// Remotedatasource class for getting response
class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
): BaseDataSource() {
// Suspend function for getting response
    suspend fun getRecords() = getResult { apiService.getAllRecords() }
    suspend fun postRecords(data: Data) = getResult { apiService.postRecords(data) }
}