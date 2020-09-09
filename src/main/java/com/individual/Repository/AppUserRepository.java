package com.individual.Repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.individual.Entity.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

	
	@Query("Select e from AppUser e Where e.userName = :userName AND e.enabled = 1")
	public AppUser findUserAccount(@Param("userName") String userName);
	
	@Transactional
	@Modifying(clearAutomatically = true)
    @Query("Update AppUser u SET u.enabled = 0 WHERE u.userId =:userId")
    int disableUser(@Param("userId") Long id); 
	
}