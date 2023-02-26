package com.crickinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crickinfo.Entity.LoginEntity;
import com.crickinfo.Repo.LoginRepo;
@Service
public class LoginService implements LoginServiceInt {
    @Autowired
    private LoginRepo lr;
	@Override
	public void postLogin(LoginEntity le) {
		lr.save(le);
		
	}

}
