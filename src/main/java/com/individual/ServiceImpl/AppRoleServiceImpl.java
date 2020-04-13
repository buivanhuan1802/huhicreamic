package com.individual.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.RepositoryImpl.AppRoleDaoImpl;
import com.individual.Service.AppRoleService;

@Service
public class AppRoleServiceImpl implements AppRoleService{

	@Autowired
	public AppRoleDaoImpl appRole;
	@Override
	public List<String> getRoleNames(Long userId) {
		// TODO Auto-generated method stub
		return appRole.getRoleNames(userId);
	}

}
