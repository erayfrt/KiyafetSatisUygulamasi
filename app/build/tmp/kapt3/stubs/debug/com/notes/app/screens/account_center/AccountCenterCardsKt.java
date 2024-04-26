package com.notes.app.screens.account_center;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a$\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\u0016\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a\n\u0010\u0012\u001a\u00020\u0007*\u00020\u0007\u00a8\u0006\u0013"}, d2 = {"AccountCenterCard", "", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "modifier", "Landroidx/compose/ui/Modifier;", "onCardClick", "Lkotlin/Function0;", "DisplayNameCard", "displayName", "onUpdateDisplayNameClick", "Lkotlin/Function1;", "ExitAppCard", "onSignOutClick", "RemoveAccountCard", "onRemoveAccountClick", "card", "app_debug"})
public final class AccountCenterCardsKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void DisplayNameCard(@org.jetbrains.annotations.NotNull
    java.lang.String displayName, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onUpdateDisplayNameClick) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void AccountCenterCard(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCardClick) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.Modifier card(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier $this$card) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void ExitAppCard(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSignOutClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RemoveAccountCard(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRemoveAccountClick) {
    }
}