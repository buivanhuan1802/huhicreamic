package com.individual.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Repository.UserRoleRepository;
import com.individual.RepositoryImpl.UserRoleDaoImpl;

@Service
public class UserRoleServiceImpl implements UserRoleRepository {
	@Autowired
	public UserRoleDaoImpl userRole;

	@Override
	public List<String> getUserRoles(Long id) {
		// TODO Auto-generated method stub
		return userRole.getUserRoles(id);
	}

}
