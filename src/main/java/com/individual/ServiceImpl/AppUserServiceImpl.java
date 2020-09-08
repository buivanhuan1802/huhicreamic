package com.individual.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.individual.Entity.AppUser;
import com.individual.Repository.AppUserRepository;
import com.individual.Service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	private AppUserRepository appUser;
	
	@Autowired
	 public AppUserServiceImpl(AppUserRepository appUser) {
		this.appUser =appUser;
	}
	@Override
	public AppUser findUserAccount(String userName) {
		// TODO Auto-generated method stub
		return appUser.findUserAccount(userName);
	}

	@Override
	public int disableUser(Long id) {
		// TODO Auto-generated method stub
		return appUser.disableUser(id);
	}
	@Override
	public Long countUser() {
		return appUser.count();
	}
	@Override
	public AppUser saveUser(AppUser user) {
		return appUser.save(user);
	}

}
