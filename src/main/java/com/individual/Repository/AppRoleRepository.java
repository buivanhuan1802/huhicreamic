package com.individual.Repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface AppRoleRepository {

	public List<String> getRoleNames(Long userId);

}