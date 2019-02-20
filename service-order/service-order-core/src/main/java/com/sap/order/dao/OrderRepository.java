package com.sap.order.dao;

import com.sap.order.domain.*;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<OrderEO, String> {
    OrderEO findById(String id);

    List<OrderEO> findAll();

    List<OrderEO> findAllByUserid(String id);

    void deleteAll();
}
