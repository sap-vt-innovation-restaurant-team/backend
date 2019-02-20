package com.sap.order.dao;

import com.sap.order.domain.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends MongoRepository<DishEO, String> {
    DishEO findById(String id);

    DishEO findByName(String name);

    List<DishEO> findAllByType(String type);

    List<DishEO> findAll();

    void deleteAll();
}
