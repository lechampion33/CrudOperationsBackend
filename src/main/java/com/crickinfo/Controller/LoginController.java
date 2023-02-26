package com.crickinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crickinfo.Entity.LoginEntity;
import com.crickinfo.Service.LoginService;

@RestController
public class LoginController {
  @Autowired
  private LoginService ls;
  @PostMapping("/logindata")
  public String postLogin(@RequestBody LoginEntity le) {
	  ls.postLogin(le);
	  return "Login Details Saved";
  }
}
