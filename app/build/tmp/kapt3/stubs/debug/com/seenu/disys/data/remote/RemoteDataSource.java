package com.seenu.disys.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/seenu/disys/data/remote/RemoteDataSource;", "Lcom/seenu/disys/data/remote/BaseDataSource;", "apiService", "Lcom/seenu/disys/data/remote/ApiService;", "(Lcom/seenu/disys/data/remote/ApiService;)V", "getRecords", "Lcom/seenu/disys/utils/Resource;", "", "Lcom/seenu/disys/data/entities/Data;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRecords", "", "data", "(Lcom/seenu/disys/data/entities/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataSource extends com.seenu.disys.data.remote.BaseDataSource {
    private final com.seenu.disys.data.remote.ApiService apiService = null;
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.remote.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRecords(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seenu.disys.utils.Resource<? extends java.util.List<com.seenu.disys.data.entities.Data>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object postRecords(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.entities.Data data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seenu.disys.utils.Resource<? extends java.lang.Object>> continuation) {
        return null;
    }
}