package com.example.demo.service;

import com.example.demo.model.Continent;
import com.example.demo.model.Countries;

import java.util.List;

public interface WorldService {
  public Continent input_world(Continent world);
  public Continent insert_country(Continent continent,String id);
  public List<Continent> getAll();
  public Continent getContinent(String name);
  public Continent getCountryByName(String countryname);
  public Continent getStateByName(String statename);
  public Continent getCityByName(String cityname);
//  public Countries input_countries(Countries countries);
//  public Continent insert(Countries country ,String id);
}
