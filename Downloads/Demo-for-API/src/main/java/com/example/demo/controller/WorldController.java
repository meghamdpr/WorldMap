package com.example.demo.controller;

import com.example.demo.model.Continent;
import com.example.demo.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class WorldController {

  @Autowired
  private WorldService worldService;


  public WorldController(WorldService worldService) {
    this.worldService = worldService;
  }

  @PostMapping("/continent")
  public Continent input(@RequestBody Continent continent){
    return worldService.input_world(continent);
  }

  @PutMapping("/continent/{id}")
  public Continent input_country(@RequestBody Continent continent,@PathVariable String id){
    return worldService.insert_country(continent,id);
  }


  @GetMapping("/all")
  public List<Continent> findall(){
    return worldService.getAll();
  }

  @GetMapping("/allcontinent/{name}")
  public Continent getByName(@PathVariable String name){
    return worldService.getContinent(name);
  }

  @GetMapping("/country/{countryname}")
  public Continent getCountryName(@PathVariable String countryname){
    return worldService.getCountryByName(countryname);
  }

  @GetMapping("/state/{statename}")
  public Continent getStateName(@PathVariable String statename){
    return worldService.getStateByName(statename);
  }

  @GetMapping("/city/{cityname}")
  public Continent getCityName(@PathVariable String cityname){
    return worldService.getCityByName(cityname);
  }

//  @GetMapping("/country/")
//  public Continent getCountryByName(@PathVariable String countryname){
//    QContinent
//  }

//  @PutMapping("/country/{id}")
//  public Continent insert_country(@RequestBody Countries country, @PathVariable String id){
//    return worldService.insert(country,id);
//  }
}
