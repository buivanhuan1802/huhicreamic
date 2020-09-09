package com.individual.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Repository.AppRoleRepository;
import com.individual.Service.AppRoleService;

@Service
public class AppRoleServiceImpl implements AppRoleService{

	
	private AppRoleRepository appRole;
	
	@Autowired
	 public AppRoleServiceImpl(AppRoleRepository appRole) {
		this.appRole = appRole;
	}
	
	@Override
	public List<String> getRoleNames(Long userId) {
		// TODO Auto-generated method stub
		return appRole.getRoleNames(userId);
	}
	

}
