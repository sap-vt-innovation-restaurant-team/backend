package com.sap.order.domain;

import com.sap.common.domain.BaseEO;
import org.springframework.data.annotation.Id;

import java.util.List;

public class OrderEO {
    @Id
    private String id;

    private List<DishEO> dishes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<DishEO> getDishes() {
        return dishes;
    }

    public void setDishes(List<DishEO> dishes) {
        this.dishes = dishes;
    }
}
