package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cities {
  private String cityname;

  public Cities() {
  }

  public Cities(String cityname) {
    this.cityname = cityname;
  }

  public String getCityname() {
    return cityname;
  }

  public void setCity_name(String cityname) {
    this.cityname = cityname;
  }
}
