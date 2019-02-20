package com.sap.order.service;

import com.sap.common.service.BaseServiceImpl;
import com.sap.order.dao.DishRepository;
import com.sap.order.dao.OrderRepository;
import com.sap.order.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class OrderServiceImpl extends BaseServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private DishRepository dishRepository;

    @Override
    public List<OrderEO> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEO insertOrder(OrderEO orderEO) {
        orderRepository.save(orderEO);
        return orderEO;
    }

    @Override
    public List<DishEO> getAllDishs() {
        return dishRepository.findAll();
    }

    @Override
    public DishEO insertDish(DishEO dishEO) {
        dishRepository.save(dishEO);
        return dishEO;
    }

    @Override
    public List<DishEO> getDishesByName(String string) {
        List<DishEO> dishes = dishRepository.findAll();
        List<DishEO> results = new ArrayList();
        Pattern pattern = Pattern.compile(string, Pattern.CASE_INSENSITIVE);
        for (int i = 0; i < dishes.size(); i++) {
            Matcher matcher = pattern.matcher(((DishEO) dishes.get(i)).getName());
            if (matcher.matches()) {
                results.add(dishes.get(i));
            }
        }
        return results;
    }

    @Override
    public List<DishEO> getDishesByTag(String tagName) {
        tagName = tagName.toLowerCase();
        List<DishEO> dishes = dishRepository.findAll();
        List<DishEO> results = new ArrayList<>();
        for (int i = 0; i < dishes.size(); i++) {
            List<String> tags = dishes.get(i).getTags();
            for (int j = 0; j < tags.size(); j++) {
                if (tagName.equals(tags.get(j).toLowerCase())) {
                    results.add(dishes.get(i));
                    break;
                } else {
                    continue;
                }
            }
        }
        return results;
    }

    @Override
    public String[] getAllTags() {
        return tags;
    }

    @Override
    public List<String> getTagsByDishName(String dishName) {
        DishEO dish = dishRepository.findByName(dishName);
        return dish.getTags();
    }

    @Override
    public List<DishEO> getDishesByOrderId(String orderId) {
        OrderEO order = orderRepository.findById(orderId);
        List<DishEO> results = new ArrayList<>();
        List<String> ids = order.getDishIds();
        for (int i = 0; i < ids.size(); i++) {
            results.add(dishRepository.findById(ids.get(i)));
        }
        return results;
    }

    @Override
    public DishEO getDishById(String string) {
        return dishRepository.findById(string);
    }

    @Override
    public List<DishEO> getDishesByType(String type) {
        return dishRepository.findAllByType(type);
    }

    @Override
    public List<OrderEO> getOrdersByUserId(String id) {
        return orderRepository.findAllByUserid(id);
    }

}
