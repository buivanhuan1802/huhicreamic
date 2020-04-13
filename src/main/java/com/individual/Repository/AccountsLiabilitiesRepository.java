package com.individual.Repository;

import java.util.List;

import com.individual.Entity.AccountsLiabilities;

public interface AccountsLiabilitiesRepository {

	public List<AccountsLiabilities> getListAccountLiabiblities();
	public AccountsLiabilities getAccountsLiabilitiesBySupplier(int id);
}
