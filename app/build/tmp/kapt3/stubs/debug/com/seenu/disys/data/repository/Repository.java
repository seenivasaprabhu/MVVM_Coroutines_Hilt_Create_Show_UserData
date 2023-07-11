package com.seenu.disys.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\b2\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/seenu/disys/data/repository/Repository;", "", "remoteDataSource", "Lcom/seenu/disys/data/remote/RemoteDataSource;", "localDataSource", "Lcom/seenu/disys/data/local/DatabaseDao;", "(Lcom/seenu/disys/data/remote/RemoteDataSource;Lcom/seenu/disys/data/local/DatabaseDao;)V", "getRecords", "Landroidx/lifecycle/LiveData;", "Lcom/seenu/disys/utils/Resource;", "", "Lcom/seenu/disys/data/entities/Data;", "postRecords", "data", "app_debug"})
public final class Repository {
    private final com.seenu.disys.data.remote.RemoteDataSource remoteDataSource = null;
    private final com.seenu.disys.data.local.DatabaseDao localDataSource = null;
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.local.DatabaseDao localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.seenu.disys.utils.Resource<java.util.List<com.seenu.disys.data.entities.Data>>> getRecords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.seenu.disys.utils.Resource<java.lang.Object>> postRecords(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.entities.Data data) {
        return null;
    }
}