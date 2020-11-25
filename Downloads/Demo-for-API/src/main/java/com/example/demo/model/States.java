package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class States {
  private String stateid;
  private String statename;
  private List<Cities> cities;

  public States() {
  }

  public States(String stateid, String statename, List<Cities> cities) {
    this.stateid = stateid;
    this.statename = statename;
    this.cities = cities;
  }

  public String getStateid() {
    return stateid;
  }

  public void setStateid(String stateid) {
    this.stateid = stateid;
  }

  public String getStatename() {
    return statename;
  }

  public void setStatename(String statename) {
    this.statename = statename;
  }

  public List<Cities> getCities() {
    return cities;
  }

  public void setCities(List<Cities> cities) {
    this.cities = cities;
  }
  //  private String name;
//
//  public States() {
//  }
//
//  public States(String name) {
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
