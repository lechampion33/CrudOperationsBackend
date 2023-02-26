package com.crickinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crickinfo.Entity.signupEntity;
import com.crickinfo.Service.SignupService;

@RestController
public class signupController {
 @Autowired
 private SignupService ss;
 @PostMapping("/postData")
 public String postData(@RequestBody signupEntity se) {
	 ss.saveData(se);
	 return "Data Posted";
 }
}
