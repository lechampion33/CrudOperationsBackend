package com.crickinfo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crickinfo.Entity.LoginEntity;
@Repository
public interface LoginRepo extends JpaRepository<LoginEntity, String> {

}
