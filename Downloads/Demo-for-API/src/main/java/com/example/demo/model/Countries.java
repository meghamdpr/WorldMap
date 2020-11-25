package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class Countries {
  private String country_id;
  private String countryname;
  private List<States> states;

  public Countries() {
  }

  public Countries(String country_id, String countryname, List<States> states) {
    this.country_id = country_id;
    this.countryname = countryname;
    this.states = states;
  }

  public String getCountry_id() {
    return country_id;
  }

  public void setCountry_id(String country_id) {
    this.country_id = country_id;
  }

  public String getCountryname() {
    return countryname;
  }

  public void setCountryname(String countryname) {
    this.countryname = countryname;
  }

  public List<States> getStates() {
    return states;
  }

  public void setStates(List<States> states) {
    this.states = states;
  }

//  private String name;
//  private Continent continent;
//
//  public Countries() {
//  }
//
//  public Countries(String name, Continent continent) {
//    this.name = name;
//    this.continent = continent;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public Continent getContinent() {
//    return continent;
//  }
//
//  public void setContinent(Continent continent) {
//    this.continent = continent;
//  }
}
