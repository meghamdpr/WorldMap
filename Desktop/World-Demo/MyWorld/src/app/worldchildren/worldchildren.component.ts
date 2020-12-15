import { Component, OnInit , OnChanges, SimpleChange, SimpleChanges} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ContinentserviceService } from '../continentservice.service';

@Component({
  selector: 'app-worldchildren',
  templateUrl: './worldchildren.component.html',
  styleUrls: ['./worldchildren.component.css']
})
export class WorldchildrenComponent implements OnInit{

  continents:any;
  countries:any;
  link:any;

  constructor(private worldservice:ContinentserviceService,private route:ActivatedRoute, private router: Router) { }
 
  // ngOnChanges(changes: SimpleChanges): void {
  //   throw new Error('Method not implemented.');
  // }

  
  ngOnInit(){
    this.worldservice.getContinents()
      .subscribe((data) =>this.continents=data)
  }

  // getcontinents(){
  //   this.worldservice.getContinents()
  //     .subscribe((data) =>this.continents=data)
  // }

  getcountriesdata(item:string){
    this.link=item;
    console.log("entered into countries");
    console.log(this.link);
    this.worldservice.getcountries(this.link).subscribe(data=>this.countries=data);
    // this.router.navigate(['countries'],{relativeTo:this.route});
  }
}
