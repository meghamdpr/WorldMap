import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { ContinentserviceService } from '../continentservice.service';
import { Region } from '../region';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addregion',
  templateUrl: './addregion.component.html',
  styleUrls: ['./addregion.component.css']
})
export class AddregionComponent implements OnInit {

  region:Region=new Region();
  message:any;
  constructor(private worldservice:ContinentserviceService,private router:Router) { }

  ngOnInit(): void {
  }

  regionaddtion(){
   console.log("adding the region");
   let resp=this.worldservice.postregion(this.region);
   alert("Region added successfully");
   resp.subscribe((data)=>this.message);
   this.router.navigate(['/World']);
  }

}
