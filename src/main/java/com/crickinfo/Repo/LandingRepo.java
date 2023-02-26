package com.crickinfo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crickinfo.Entity.LandingEntity;
@Repository
public interface LandingRepo extends JpaRepository<LandingEntity, Integer> {

}
