package com.sap.user.service;

import com.sap.common.service.BaseService;
import com.sap.user.domain.UserEO;

import java.util.List;

public interface UserService extends BaseService {
  List<UserEO> getAllUsers();

  void insertTestUser();
}
