package com.individual.Service;

import java.util.List;

import com.individual.Entity.UserRole;

public interface UserRoleService {

	UserRole SaveUserRole(UserRole userRole);
	List<UserRole> getUserRoles(Iterable<Long> userId);
}
