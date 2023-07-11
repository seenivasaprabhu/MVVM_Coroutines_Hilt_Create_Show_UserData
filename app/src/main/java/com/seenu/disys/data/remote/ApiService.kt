package com.seenu.disys.data.remote

import com.seenu.disys.data.entities.Data
import com.seenu.disys.utils.EndPoint
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

//Interface for API service
interface ApiService {
    @GET(EndPoint)
	//Suspend function to get response from server
    suspend fun getAllRecords() : Response<List<Data>>
    @POST(EndPoint)
    suspend fun postRecords(@Body data: Data): Response<Any>

}