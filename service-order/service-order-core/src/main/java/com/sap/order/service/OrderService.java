package com.sap.order.service;

import com.sap.common.service.BaseService;
import com.sap.order.domain.*;

import java.util.*;

public interface OrderService extends BaseService {

    String[] tags = {"Extra Hot","Hot","Medium","Mild","Extra Mild","Salty","Sweet","Spicy","Icy","German","Fried","Kids","Cooked"};

    String[] types = {"Main course", "Dessert", "Soup", "Beverage"};

    List<OrderEO> getAllOrders();

    OrderEO insertOrder(OrderEO orderEO);

    List<DishEO> getAllDishs();

    DishEO insertDish(DishEO dishEO);

    List<DishEO> getDishesByName(String string);

    List<DishEO> getDishesByTag(String tagName);

    String[] getAllTags();

    List<String> getTagsByDish(String dishName);

    List<DishEO> getDishesByOrderId(String orderId);
}
