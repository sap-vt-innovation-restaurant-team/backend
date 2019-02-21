package com.sap.user.service;

import com.sap.common.service.BaseService;
import com.sap.user.domain.UserEO;

import java.util.List;

public interface UserService extends BaseService {
  List<UserEO> getAllUsers();

  void insertTestUser();

  UserEO whateverName(String userId);

  String returnUser(UserEO userEO);  // return status code which shows whether registration is successful

}
