import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Routes } from '@angular/router';
import { WorldComponent } from './world/world.component';
import { WorldchildrenComponent } from './worldchildren/worldchildren.component';
import {HttpClientModule} from '@angular/common/http';
import { ContinentserviceService } from './continentservice.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule } from "@angular/material/card";
import { MatButtonModule } from "@angular/material/button";
import { FlexLayoutModule } from "@angular/flex-layout";
import { ContinentchildrenComponent } from './continentchildren/continentchildren.component';

const appRoutes: Routes=[
]

@NgModule({
  declarations: [
    AppComponent,
    WorldComponent,
    WorldchildrenComponent,
    ContinentchildrenComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    FlexLayoutModule
  ],
  providers: [ContinentserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
