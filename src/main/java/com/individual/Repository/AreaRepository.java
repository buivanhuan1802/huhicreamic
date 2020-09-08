package com.individual.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.individual.Entity.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer>{

}
