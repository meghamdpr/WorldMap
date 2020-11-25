package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "meghana")
public class Continent {

  @Id
  private String id;
  private String name;
  private List<Countries> country;
//  private Countries countries;

  public Continent() {
  }

  public Continent(String id, String name, List<Countries> country) {
    this.id = id;
    this.name = name;
    this.country = country;
  }

//  public Continent(Countries countries) {
//    this.countries = countries;
//  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Countries> getCountry() {
    return country;
  }

  public void setCountry(List<Countries> country) {
    this.country = country;
  }

//  public Countries getCountries() {
//    return countries;
//  }

//  public void setCountries(Countries countries) {
//    this.countries = countries;
//  }

//  private String name;
//
//  public Continent() {
//  }
//
//  public Continent(String name) {
//    this.name = name;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
}
