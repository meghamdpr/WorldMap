import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Icontinent } from 'src/continent';
import { Region } from './region';

@Injectable({
  providedIn: 'root'
})
export class ContinentserviceService {

  
  springEndpoint: string | undefined;
  postEndpoint: string | undefined;
  
  constructor(private http:HttpClient) {
    this.springEndpoint='http://localhost:8080/api/v1/getbyplace/';
    this.postEndpoint='http://localhost:8080/api/v1/continent';
   }

  getContinents(){
    return this.http.get("http://localhost:8080/api/v1/getbyplace/World");
  }

  getcountries(link:string){
    return this.http.get(`${this.springEndpoint}/${link}`);
  }

  getstates(country:string){
    return this.http.get(`${this.springEndpoint}/${country}`);
  }

  postregion(region: Region){
    return this.http.post(`${this.postEndpoint}/${region.parent}`,region,{responseType:'text' as 'json'});
  }
}
