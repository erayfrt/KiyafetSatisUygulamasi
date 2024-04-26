package com.notes.app.model.service.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/notes/app/model/service/module/ServiceModule;", "", "()V", "provideAccountService", "Lcom/notes/app/model/service/AccountService;", "impl", "Lcom/notes/app/model/service/impl/AccountServiceImpl;", "provideStorageService", "Lcom/notes/app/model/service/StorageService;", "Lcom/notes/app/model/service/impl/StorageServiceImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class ServiceModule {
    
    public ServiceModule() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.app.model.service.AccountService provideAccountService(@org.jetbrains.annotations.NotNull
    com.notes.app.model.service.impl.AccountServiceImpl impl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.app.model.service.StorageService provideStorageService(@org.jetbrains.annotations.NotNull
    com.notes.app.model.service.impl.StorageServiceImpl impl);
}