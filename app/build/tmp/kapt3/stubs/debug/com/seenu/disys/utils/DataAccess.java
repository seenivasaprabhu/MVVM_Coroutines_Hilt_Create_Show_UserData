package com.seenu.disys.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JL\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0082\u0001\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00050\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u00062\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00040\u00102\"\u0010\t\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/seenu/disys/utils/DataAccess;", "", "()V", "createOperation", "Landroidx/lifecycle/LiveData;", "Lcom/seenu/disys/utils/Resource;", "A", "data", "Lcom/seenu/disys/data/entities/Data;", "networkCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/seenu/disys/data/entities/Data;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "performOperation", "T", "databaseQuery", "Lkotlin/Function0;", "saveCallResult", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "app_debug"})
public final class DataAccess {
    @org.jetbrains.annotations.NotNull()
    public static final com.seenu.disys.utils.DataAccess INSTANCE = null;
    
    private DataAccess() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object, A extends java.lang.Object>androidx.lifecycle.LiveData<com.seenu.disys.utils.Resource<T>> performOperation(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.LiveData<T>> databaseQuery, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.seenu.disys.utils.Resource<? extends A>>, ? extends java.lang.Object> networkCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> saveCallResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <A extends java.lang.Object>androidx.lifecycle.LiveData<com.seenu.disys.utils.Resource<A>> createOperation(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.entities.Data data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.seenu.disys.utils.Resource<? extends A>>, ? extends java.lang.Object> networkCall) {
        return null;
    }
}