package com.individual.Repository;

import com.individual.Entity.AppUser;

public interface AppUserRepository {

	public AppUser findUserAccount(String userName);

}