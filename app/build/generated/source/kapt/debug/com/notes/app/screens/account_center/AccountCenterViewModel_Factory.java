package com.notes.app.screens.account_center;

import com.notes.app.model.service.AccountService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AccountCenterViewModel_Factory implements Factory<AccountCenterViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  public AccountCenterViewModel_Factory(Provider<AccountService> accountServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
  }

  @Override
  public AccountCenterViewModel get() {
    return newInstance(accountServiceProvider.get());
  }

  public static AccountCenterViewModel_Factory create(
      Provider<AccountService> accountServiceProvider) {
    return new AccountCenterViewModel_Factory(accountServiceProvider);
  }

  public static AccountCenterViewModel newInstance(AccountService accountService) {
    return new AccountCenterViewModel(accountService);
  }
}
