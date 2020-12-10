import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Icontinent } from 'src/continent';

@Injectable({
  providedIn: 'root'
})
export class ContinentserviceService {

  constructor(private http:HttpClient) { }

  getContinents(){
    return this.http.get("http://localhost:8080/api/v1/getbyplace/World");
  }

  getcountries(){
    return this.http.get("http://localhost:8080/api/v1/getbyplace/{{link}}")
  }
}
