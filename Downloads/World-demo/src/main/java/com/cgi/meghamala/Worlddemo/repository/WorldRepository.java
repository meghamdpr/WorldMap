package com.cgi.meghamala.Worlddemo.repository;

import com.cgi.meghamala.Worlddemo.model.WorldModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorldRepository extends MongoRepository<WorldModel,String> {
  WorldModel findByPlace(String place);
  void deleteByPlace(String place);
}
