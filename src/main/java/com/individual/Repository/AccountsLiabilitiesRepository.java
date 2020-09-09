package com.individual.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.individual.Entity.AccountsLiabilities;

@Repository
public interface AccountsLiabilitiesRepository {

	public List<AccountsLiabilities> getListAccountLiabiblities();
	public AccountsLiabilities getAccountsLiabilitiesBySupplier(int id);
}
