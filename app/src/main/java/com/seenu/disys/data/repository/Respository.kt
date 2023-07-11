package com.seenu.disys.data.repository

import com.seenu.disys.data.entities.Data
import com.seenu.disys.data.local.DatabaseDao
import com.seenu.disys.data.remote.RemoteDataSource
import com.seenu.disys.utils.DataAccess
import javax.inject.Inject

//Repositary class to get server response and add room database 
class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: DatabaseDao
) {
//Function for perform data access operation from server to db
    fun getRecords() = DataAccess.performOperation(
	//Fetch records from room db
        databaseQuery = { localDataSource.getAllRecords() },
	//Get records from server
        networkCall = { remoteDataSource.getRecords() },
	//Save records to room db 
        saveCallResult = { model -> localDataSource.insertAll(model) }
    )

    fun postRecords(data : Data) = DataAccess.createOperation(data,
        //Get records from server
        networkCall = { remoteDataSource.postRecords(data) },
    )


}