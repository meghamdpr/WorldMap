package com.example.demo.repository;

import com.example.demo.model.Continent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface Repository extends MongoRepository<Continent,String>{

  Continent findByName(String name);

  @Query(value = "{'country.countryname':?0}")
  Continent findByCountryname(String countryname);

  @Query(value ="{'country.states.statename':?0}")
  Continent findByStatename(String statename);

  @Query(value = "{'country.states.cities.cityname':?0}")
  Continent findByCityname(String cityname);

}
