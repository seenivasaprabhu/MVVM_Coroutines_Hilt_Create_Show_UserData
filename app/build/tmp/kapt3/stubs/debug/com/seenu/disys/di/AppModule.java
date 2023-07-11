package com.seenu.disys.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\bH\u0007J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0011H\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/seenu/disys/di/AppModule;", "", "()V", "provideApiService", "Lcom/seenu/disys/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideDao", "Lcom/seenu/disys/data/local/DatabaseDao;", "db", "Lcom/seenu/disys/data/local/AppDatabase;", "provideDatabase", "appContext", "Landroid/content/Context;", "provideGson", "Lcom/google/gson/Gson;", "provideOkHttp", "Lokhttp3/OkHttpClient;", "provideRemoteDataSource", "Lcom/seenu/disys/data/remote/RemoteDataSource;", "apiService", "provideRepository", "Lcom/seenu/disys/data/repository/Repository;", "remoteDataSource", "localDataSource", "provideRetrofit", "gson", "okhttp", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seenu.disys.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okhttp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.seenu.disys.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seenu.disys.data.remote.RemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.remote.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seenu.disys.data.local.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seenu.disys.data.local.DatabaseDao provideDao(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.local.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seenu.disys.data.repository.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.local.DatabaseDao localDataSource) {
        return null;
    }
}