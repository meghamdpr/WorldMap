import { Component, OnInit, Input } from '@angular/core';
import { ContinentserviceService } from '../continentservice.service';

@Component({
  selector: 'app-continentchildren',
  templateUrl: './continentchildren.component.html',
  styleUrls: ['./continentchildren.component.css']
})
export class ContinentchildrenComponent implements OnInit {

  // @Input()
  // mycontinent!: string;
  @Input() countries:any;
  mycountry:string | undefined;
  states:any;
  constructor(private worldservice:ContinentserviceService) { }

  ngOnInit(){

  }

  // getstatesdata(item:string){
  //   this.country=item;
  //   // this.link=item;
  //   console.log("entered into states");
  //   console.log(this.country);
  //   this.worldservice.getstates(this.country).subscribe((data)=>this.states=data);
  // }

  getstatesdata(item:string){
    this.mycountry=item;
    // this.link=item;
    console.log("entered into states");
    console.log(this.mycountry);
    this.worldservice.getstates(this.mycountry).subscribe((data)=>this.states=data);
  }

}
