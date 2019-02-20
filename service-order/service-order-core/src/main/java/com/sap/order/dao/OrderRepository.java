package com.sap.order.dao;

import com.sap.order.domain.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<OrderEO, String> {
    OrderEO findById(String id);

    List<OrderEO> findAll();

    void deleteAll();

}
