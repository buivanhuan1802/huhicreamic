package com.individual.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.individual.Entity.Role;


@Repository
public interface AppRoleRepository extends JpaRepository<Role, Long> {

	@Query( value = "SELECT a.role_name FROM user_role AS c JOIN app_role AS a ON a.role_id = c.role_id WHERE c.user_id =:userId",nativeQuery = true)
	List<String> getRoleNames(@Param(value = "userId")Long userId);
	
}