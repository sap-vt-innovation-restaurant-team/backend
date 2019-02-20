package com.sap.order.domain;

import com.sap.common.domain.BaseEO;
import org.springframework.data.annotation.Id;

import java.util.List;

public class OrderEO {
    @Id
    private String id;

    private String userid;

    private List<String> dishIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getDishIds() {
        return dishIds;
    }

    public void setDishIds(List<String> dishIds) {
        this.dishIds = dishIds;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
