package com.sap.order.controller;

import com.sap.common.constants.HttpConstants;
import com.sap.common.controller.BaseController;
import com.sap.order.domain.DishEO;
import com.sap.order.domain.OrderEO;
import com.sap.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController extends BaseController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getAllDishes", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    public List<DishEO> getAllDishes() {
        return orderService.getAllDishs();
    }

    @RequestMapping(value = "/getAllTags", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    public String[] getAllTags() {
        return orderService.getAllTags();
    }

    @RequestMapping(value = "/getDishesByTag", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    public List<DishEO> getDishesByTag(@RequestParam(value = "tagName") String tagName) {
        return orderService.getDishesByTag(tagName);
    }

    @RequestMapping(value = "/getDishesByOrderId", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    public List<DishEO> getDishesByOrderId(@RequestParam(value = "orderId") String orderId) {
        return orderService.getDishesByOrderId(orderId);
    }

    @RequestMapping(value = "/getTagsByDish", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    public List<String> getTagsByDish(@RequestParam(value = "dishName") String dishName) {
        return orderService.getTagsByDish(dishName);
    }

    @RequestMapping(value = "/insertOrder", method = RequestMethod.POST, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public Object insertOrder(@RequestBody OrderEO orderEO) {
        System.out.println("testing");
        return orderService.insertOrder(orderEO);
    }

    @RequestMapping(value = "/insertDish", method = RequestMethod.POST, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public Object insertDish(@RequestBody DishEO dishEO) {
        return orderService.insertDish(dishEO);
    }

    @RequestMapping(value = "/getDishesByName", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public List<DishEO> getDishesByName(@RequestParam(value = "dishName") String dishName) {
        return orderService.getDishesByName(dishName);
    }

}
