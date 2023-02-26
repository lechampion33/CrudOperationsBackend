package com.crickinfo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crickinfo.Entity.signupEntity;
@Repository
public interface SignupRepo extends JpaRepository<signupEntity, Integer> {

}
