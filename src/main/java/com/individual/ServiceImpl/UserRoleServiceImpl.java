package com.individual.ServiceImpl;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.individual.Entity.UserRole;
import com.individual.Repository.UserRoleRepository;
import com.individual.Service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	private UserRoleRepository userRole;

	@Autowired
	public UserRoleServiceImpl(UserRoleRepository userRole) {

		this.userRole = userRole;
	}

	@Override
	public UserRole SaveUserRole(UserRole ur) {
		// TODO Auto-generated method stub
		return userRole.save(ur);
	}

	@Override
	public List<UserRole> getUserRoles(Iterable<Long> userId) {
		return userRole.findAllById(userId);
	}

}
