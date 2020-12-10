package com.cgi.meghamala.Worlddemo.controller;

import com.cgi.meghamala.Worlddemo.model.WorldModel;
import com.cgi.meghamala.Worlddemo.repository.WorldRepository;
import com.cgi.meghamala.Worlddemo.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WorldController {
  @Autowired
  private WorldService worldService;
  private WorldRepository worldRepository;

  public WorldController(WorldService worldService, WorldRepository worldRepository) {
    this.worldService = worldService;
    this.worldRepository = worldRepository;
  }

  @PostMapping("/api/v1/world")
  public WorldModel post_the_world(@RequestBody WorldModel worldModel){
    return worldService.post_world(worldModel);
  }

  @PostMapping("/api/v1/continent/{parent}")
  @PutMapping
  public void post_the_continent(@RequestBody WorldModel worldModel,@PathVariable String parent){
    String children=worldModel.getPlace();
    worldService.post_update_world(worldService.change_world(parent),children);
    worldService.post_continent(worldModel,parent);
  }

  @GetMapping("/api/v1/getworld")
  public List<WorldModel> get_the_world(){
    return worldService.get_world();
  }

  @GetMapping("/api/v1/getbyplace/{place}")
  public WorldModel get_data_by_place(@PathVariable String place){
    return worldService.get_data(place);
  }

  @PutMapping("/api/v1/update/{place}")
  public void update(@RequestBody WorldModel worldModel,@PathVariable String place){
    worldService.post_update_world(worldService.change_world(worldModel.getParent()), worldModel.getPlace());
    worldService.post_continent(worldModel,worldModel.getParent());
  }

  @DeleteMapping("/api/v1/delete/{place}/{parent}")
  @PutMapping()
  public void delete(@PathVariable String place,@PathVariable String parent){
    worldService.get_parent(parent,place);
    worldService.delete_data(place);
  }
}
