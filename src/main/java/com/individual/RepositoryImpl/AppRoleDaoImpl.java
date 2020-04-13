package com.individual.RepositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.individual.Entity.UserRole;
import com.individual.Repository.AppRoleRepository;

@Repository
@Transactional
public class AppRoleDaoImpl implements AppRoleRepository {
	@Autowired
	private EntityManager entityManager;

	public List<String> getRoleNames(Long userId) {
		String sql = "Select ur.appRole.roleName from " + UserRole.class.getName() + " ur " //
				+ " where ur.appUser.userId = :userId ";

		Query query = this.entityManager.createQuery(sql, String.class);
		query.setParameter("userId", userId);
		return query.getResultList();
	}
}
