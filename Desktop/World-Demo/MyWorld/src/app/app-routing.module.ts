import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContinentchildrenComponent } from './continentchildren/continentchildren.component';
import { WorldComponent } from './world/world.component';
import { WorldchildrenComponent } from './worldchildren/worldchildren.component';

const routes: Routes = [
  {path:'',component:WorldComponent},
  {path:'World',component:WorldchildrenComponent},
  {path:'countries',component:ContinentchildrenComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
