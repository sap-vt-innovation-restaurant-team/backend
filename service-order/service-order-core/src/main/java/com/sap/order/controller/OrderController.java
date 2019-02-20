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
    @ResponseBody
    public List<DishEO> getAllDishes() {
        return orderService.getAllDishs();
    }

    @RequestMapping(value = "/getAllTags", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public String[] getAllTags() {
        return orderService.getAllTags();
    }

    @RequestMapping(value = "/getDishesByTag", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public List<DishEO> getDishesByTag(@RequestParam(value = "tagName") String tagName) {
        return orderService.getDishesByTag(tagName);
    }

    @RequestMapping(value = "/getDishesByOrderId", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public List<DishEO> getDishesByOrderId(@RequestParam(value = "orderId") String orderId) {
        return orderService.getDishesByOrderId(orderId);
    }

    @RequestMapping(value = "/getTagsByDishName", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public List<String> getTagsByDishName(@RequestParam(value = "dishName") String dishName) {
        return orderService.getTagsByDishName(dishName);
    }

    @RequestMapping(value = "/insertOrder", method = RequestMethod.POST, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public Object insertOrder(@RequestBody OrderEO orderEO) {
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

    @RequestMapping(value = "/getDishById", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public DishEO getDishById(@RequestParam(value = "dishId") String dishId) {
        return orderService.getDishById(dishId);
    }

    @RequestMapping(value = "/getDishesByType", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public Object getDishesByType(@RequestParam(value = "type") String type) {
        return orderService.getDishesByType(type);
    }

    @RequestMapping(value = "/getOrdersByUserId", method = RequestMethod.GET, produces = HttpConstants.PRODUCE_JSON)
    @ResponseBody
    public List<OrderEO> getOrdersByUserId(@RequestParam(value = "userId") String userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
