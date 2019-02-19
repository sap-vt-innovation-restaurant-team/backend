package com.sap.user.controller;

import com.sap.common.constants.HttpConstants;
import com.sap.common.controller.BaseController;
import com.sap.user.service.UserService;
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
}
