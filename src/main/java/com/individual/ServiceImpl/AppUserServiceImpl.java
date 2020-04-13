package com.individual.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Entity.AppUser;
import com.individual.RepositoryImpl.AppUserDaoImpl;
import com.individual.Service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired
	public AppUserDaoImpl appUser;

	@Override
	public AppUser findUserAccount(String userName) {
		// TODO Auto-generated method stub
		return appUser.findUserAccount(userName);
	}

}
