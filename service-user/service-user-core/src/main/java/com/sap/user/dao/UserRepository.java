package com.sap.user.dao;

import com.sap.user.domain.UserEO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEO, String> {
  UserEO findById(String id);

  UserEO findByNickname(String nickname);

  UserEO findByEmail(String email);

  List<UserEO> findAll();

  void deleteAll();
}
