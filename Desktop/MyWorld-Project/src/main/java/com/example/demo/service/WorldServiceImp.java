package com.example.demo.service;

import com.example.demo.model.Continent;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldServiceImp implements WorldService{

  @Autowired
  private Repository repository;


  public WorldServiceImp(Repository repository) {
    this.repository = repository;
  }

  @Override
  public Continent input_world(Continent continent) {
    return repository.save(continent);
  }



//  @Override
//  public Continent insert(Countries country, String id) {
//    Continent continent=repository.findById(id).get();
//    continent.setCountries(country);
//    return repository.save(continent);
//  }

  @Override
  public Continent insert_country(Continent continent,String id) {
    Continent continent1=repository.findById(id).get();
    continent1.setId(id);
    continent1=continent;
    repository.save(continent1);
    return continent1;
  }

  @Override
  public List<Continent> getAll() {
    return repository.findAll();
  }

  @Override
  public Continent getContinent(String name) {
    return repository.findByName(name);
  }

  @Override
  public Continent getCountryByName(String countryname) {
    return repository.findByCountryname(countryname);
  }

  @Override
  public Continent getStateByName(String statename) {
    return repository.findByStatename(statename);
  }

  @Override
  public Continent getCityByName(String cityname) {
    return repository.findByCityname(cityname);
  }


}
