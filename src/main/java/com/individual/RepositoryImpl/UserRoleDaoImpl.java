package com.individual.RepositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.individual.Entity.UserRole;
import com.individual.Repository.UserRoleRepository;

@Repository
@Transactional
public class UserRoleDaoImpl implements UserRoleRepository {
	@Autowired
	private EntityManager entityManager;

	public List<String> getUserRoles(Long id) {
		try {
			String sql = "Select e.appRole.roleName from " + UserRole.class.getName() + " e " //
					+ " Where e.appUser.userId = :userid ";

			Query query = entityManager.createQuery(sql, String.class);
			query.setParameter("userid", id);

			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
}
