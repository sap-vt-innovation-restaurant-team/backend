package com.sap.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json;Charset=UTF-8")
  public String test(
          @RequestParam(value = "id") String testId
  ) {
    return "hi world!";
  }
}
