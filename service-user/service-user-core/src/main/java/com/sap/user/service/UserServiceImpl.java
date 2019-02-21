package com.sap.user.service;

import com.sap.common.service.BaseServiceImpl;
import com.sap.user.dao.UserRepository;
import com.sap.user.domain.UserEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public List<UserEO> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public void insertTestUser() {
    UserEO userEO = new UserEO();
    userEO.setNickname("tester");
    userEO.setEmail("test@sap.com");
    userRepository.save(userEO);
  }

  @Override
  public UserEO whateverName(String userId) {
    userId = userId + "test";
    return userRepository.findById(userId);
  }

  @Override
  public String returnUser(UserEO userEO) {
      String num = userEO.getPhoneNumber();
      if(userRepository.findByphoneNumber(num)!= null)
          return "";         // 1 ---- User has already existed.
      else
      {
          userRepository.save(userEO);
          return userEO.getId();        // 0 ---- User registered successfully.
      }
  }

  @Override
  public UserEO getUserEO(String userId){
      return userRepository.findById(userId);
  }
}
