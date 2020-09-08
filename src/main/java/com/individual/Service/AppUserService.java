package com.individual.Service;



import com.individual.Entity.AppUser;

public interface AppUserService {
	public AppUser findUserAccount(String userName);
	int disableUser(Long id);
	Long countUser();
	AppUser saveUser(AppUser user);
}
