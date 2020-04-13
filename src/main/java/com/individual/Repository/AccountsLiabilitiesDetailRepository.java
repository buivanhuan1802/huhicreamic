package com.individual.Repository;

import java.util.List;
import com.individual.Entity.AccountsLiabilitiesDetail;;
public interface AccountsLiabilitiesDetailRepository {

	public List<AccountsLiabilitiesDetail> getListAccountLiabiblitiesbyId(int id);
	public AccountsLiabilitiesDetail getAccountsLiabilitiesBySupplier(int id);
	
}
