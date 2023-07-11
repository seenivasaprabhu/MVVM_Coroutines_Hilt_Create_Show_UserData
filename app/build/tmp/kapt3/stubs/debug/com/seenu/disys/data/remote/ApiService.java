package com.seenu.disys.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/seenu/disys/data/remote/ApiService;", "", "getAllRecords", "Lretrofit2/Response;", "", "Lcom/seenu/disys/data/entities/Data;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRecords", "data", "(Lcom/seenu/disys/data/entities/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getAllRecords(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.seenu.disys.data.entities.Data>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users")
    public abstract java.lang.Object postRecords(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seenu.disys.data.entities.Data data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.Object>> continuation);
}