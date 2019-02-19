package com.sap.common.service;

import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
  @Override
  public String test(String id) {
    return "test service accessed by " + id + "!";
  }
}
