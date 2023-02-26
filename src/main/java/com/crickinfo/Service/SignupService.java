package com.crickinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crickinfo.Entity.signupEntity;
import com.crickinfo.Repo.SignupRepo;
@Service
public class SignupService implements SignupInt {
	@Autowired
    private SignupRepo sr;
	@Override
	public void saveData(signupEntity se) {
		sr.save(se);
		
	}

}
