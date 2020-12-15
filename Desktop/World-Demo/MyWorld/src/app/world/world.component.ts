import { Component, OnInit } from '@angular/core';
import { ContinentserviceService } from '../continentservice.service';

@Component({
  selector: 'app-world',
  templateUrl: './world.component.html',
  styleUrls: ['./world.component.css']
})
export class WorldComponent implements OnInit {

  public result : string[] = [];
  continents:any;

  constructor(private worldservice:ContinentserviceService) { }

  ngOnInit():void{
  }

  getcontinents(){
    this.worldservice.getContinents()
    .subscribe((data) =>this.continents=data)
  }

}
