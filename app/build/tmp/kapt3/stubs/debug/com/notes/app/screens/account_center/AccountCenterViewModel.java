package com.notes.app.screens.account_center;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fJ\u001a\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fJ\u001a\u0010\u0013\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fJ\u001a\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/notes/app/screens/account_center/AccountCenterViewModel;", "Lcom/notes/app/screens/NotesAppViewModel;", "accountService", "Lcom/notes/app/model/service/AccountService;", "(Lcom/notes/app/model/service/AccountService;)V", "_user", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/notes/app/model/User;", "user", "Lkotlinx/coroutines/flow/StateFlow;", "getUser", "()Lkotlinx/coroutines/flow/StateFlow;", "onDeleteAccountClick", "", "restartApp", "Lkotlin/Function1;", "", "onSignInClick", "openScreen", "onSignOutClick", "onSignUpClick", "onUpdateDisplayNameClick", "newDisplayName", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AccountCenterViewModel extends com.notes.app.screens.NotesAppViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.notes.app.model.service.AccountService accountService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.notes.app.model.User> _user = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.notes.app.model.User> user = null;
    
    @javax.inject.Inject
    public AccountCenterViewModel(@org.jetbrains.annotations.NotNull
    com.notes.app.model.service.AccountService accountService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.notes.app.model.User> getUser() {
        return null;
    }
    
    public final void onUpdateDisplayNameClick(@org.jetbrains.annotations.NotNull
    java.lang.String newDisplayName) {
    }
    
    public final void onSignInClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> openScreen) {
    }
    
    public final void onSignUpClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> openScreen) {
    }
    
    public final void onSignOutClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> restartApp) {
    }
    
    public final void onDeleteAccountClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> restartApp) {
    }
}