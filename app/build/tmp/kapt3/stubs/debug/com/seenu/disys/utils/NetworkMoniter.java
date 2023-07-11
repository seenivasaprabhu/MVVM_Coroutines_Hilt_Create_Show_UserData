package com.seenu.disys.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/seenu/disys/utils/NetworkMoniter;", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "validNetworks", "", "Landroid/net/Network;", "checkValidNetworks", "", "createNetworkCallback", "onActive", "onInactive", "DoesNetworkHaveInternet", "app_debug"})
public final class NetworkMoniter extends androidx.lifecycle.LiveData<java.lang.Boolean> {
    private android.net.ConnectivityManager.NetworkCallback networkCallback;
    private final android.net.ConnectivityManager connectivityManager = null;
    private final java.util.Set<android.net.Network> validNetworks = null;
    
    public NetworkMoniter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final void checkValidNetworks() {
    }
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    private final android.net.ConnectivityManager.NetworkCallback createNetworkCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/seenu/disys/utils/NetworkMoniter$DoesNetworkHaveInternet;", "", "()V", "execute", "", "socketFactory", "Ljavax/net/SocketFactory;", "app_debug"})
    public static final class DoesNetworkHaveInternet {
        @org.jetbrains.annotations.NotNull()
        public static final com.seenu.disys.utils.NetworkMoniter.DoesNetworkHaveInternet INSTANCE = null;
        
        private DoesNetworkHaveInternet() {
            super();
        }
        
        public final boolean execute(@org.jetbrains.annotations.NotNull()
        javax.net.SocketFactory socketFactory) {
            return false;
        }
    }
}