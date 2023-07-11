package com.seenu.disys.ui.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/seenu/disys/ui/viewModel/ViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/seenu/disys/data/repository/Repository;", "(Lcom/seenu/disys/data/repository/Repository;)V", "getRecord", "Landroidx/lifecycle/LiveData;", "Lcom/seenu/disys/utils/Resource;", "", "Lcom/seenu/disys/data/entities/Data;", "postRecord", "", "data", "app_debug"})
public final class ViewModel extends androidx.lifecycle.ViewModel {
    private final com.seenu.disys.data.repository.Repository repository = null;
    
    @javax.inject.Inject()
    public ViewModel(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.seenu.disys.utils.Resource<java.util.List<com.seenu.disys.data.entities.Data>>> getRecord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.seenu.disys.utils.Resource<java.lang.Object>> postRecord(@org.jetbrains.annotations.NotNull()
    com.seenu.disys.data.entities.Data data) {
        return null;
    }
}