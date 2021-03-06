package com.sap.user.controller;

import com.sap.common.constants.HttpConstants;
import com.sap.common.controller.BaseController;
import com.sap.user.service.UserService;
import com.sap.user.domain.UserEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController extends BaseController {
  @Autowired
  private UserService userService;

  @RequestMapping(value = "/test", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
  public String test(
          @RequestParam(value = "id") String testId
  ) {
    return userService.test(testId);
  }

  @RequestMapping(value = "/count", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
  @ResponseBody
  public Object count() {
    return userService.getAllUsers();
  }

  @RequestMapping(value = "/insert", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
  @ResponseBody
  public Object insert() {
    userService.insertTestUser();
    return userService.getAllUsers();
  }

  @RequestMapping(value = "/getUserById", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
  @ResponseBody
  public Object want(
          @RequestParam(value = "userId", required = false) String userId
  ) {
    if (userId == null) {
      return userService.getAllUsers();
    } else {
      return userService.getUserEO(userId);
    }
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST, produces = HttpConstants.PRODUCE_JSON)
  @ResponseBody
  public Object register(
          @RequestBody UserEO userEO
  ) {
    return userService.returnUser(userEO);
  }

}
