package com.seenu.disys.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.seenu.disys.data.local.AppDatabase
import com.seenu.disys.data.local.DatabaseDao
import com.seenu.disys.data.remote.ApiService
import com.seenu.disys.data.remote.RemoteDataSource
import com.seenu.disys.data.repository.Repository
import com.seenu.disys.utils.BaseUrl
import com.seenu.disys.utils.accesstoken
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//Hilt Module class for access services 
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
	// fun to privide retrofit instanse for app
    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson,okhttp :OkHttpClient) : Retrofit = Retrofit.Builder()
        .baseUrl(BaseUrl).client(okhttp)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
	// fun to privide gson instanse for retrofit
    @Provides
    fun provideGson(): Gson = GsonBuilder().create()
    // fun to privide okhttp instanse for retrofit
    @Provides
    fun provideOkHttp(): OkHttpClient{
        val intercepter = HttpLoggingInterceptor()
        intercepter.level = HttpLoggingInterceptor.Level.BODY
   return OkHttpClient.Builder()
       .addInterceptor(intercepter)
       .addInterceptor{
        chain -> val request = chain.request().newBuilder().addHeader("Authorization","Bearer $accesstoken").build()
    chain.proceed(request)

    }.build()}

	// fun to privide api service
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

	// fun to privide remotedatasource
    @Singleton
    @Provides
    fun provideRemoteDataSource(apiService: ApiService) = RemoteDataSource(apiService)
	// fun to privide database
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context) = AppDatabase.getDatabase(appContext)
	// fun to privide DAO 
    @Singleton
    @Provides
    fun provideDao(db: AppDatabase) = db.Dao()
	// fun to privide repository
    @Singleton
    @Provides
    fun provideRepository(remoteDataSource: RemoteDataSource,
                          localDataSource: DatabaseDao) =
        Repository(remoteDataSource, localDataSource)

}

