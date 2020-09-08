package com.individual.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.individual.Entity.AccountsLiabilitiesDetail;


@Repository
public interface AccountsLiabilitiesDetailRepository {

	public List<AccountsLiabilitiesDetail> getListAccountLiabiblitiesbyId(int id);
	public AccountsLiabilitiesDetail getAccountsLiabilitiesBySupplier(int id);
	
}
