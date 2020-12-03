package com.cgi.meghamala.Worlddemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "world")
public class WorldModel {

  @Id
  private String place;
  private String parent;
  private ArrayList<String> children=new ArrayList<>();

  public WorldModel() {
  }

  public WorldModel(String place, String parent, ArrayList<String> children) {
    this.place = place;
    this.parent = parent;
    this.children = children;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public ArrayList<String> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<String> children) {
    this.children = children;
  }
}
