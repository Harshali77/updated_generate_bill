

import { Injectable } from '@angular/core';
import {VehicleUsers} from '../vehicleapplication/vehicle-users';
import {Login} from '../vehicleapplication/Login';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Router} from '@angular/router';
import { Observable, of } from 'rxjs';
import { tap, catchError, map } from 'rxjs/operators';
import {Parts} from '../vehicleapplication/Parts';
import {Bill} from '../vehicleapplication/Bill';
import {VehicleVehicle} from '../vehicleapplication/vehicle-vehicle';
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
}

@Injectable({
  providedIn: 'root'
})
export class VehicleApplicationService {
  vehicleusers: VehicleUsers[] = [];
Bill:Bill[]=[];
  router: Router;
  Parts: Parts[]= [];
    vehiclevehicle: VehicleVehicle[] = [];
 
  
  constructor(private httpClient: HttpClient) { }

  // Add a loan application
  addUser(user:VehicleUsers) {
    console.log('Inside verhicle service addmethod...'+user.email
    )
    this.httpClient.post('http://localhost:7777/users/newuser', user).subscribe((response) => {
      console.log('Inside angular add service.....');
    });
  }
  verifyUser(user:Login) {
    console.log('Inside verhicle service verify user...'+user.userName+ user.userType+user.password);
     return this.httpClient.post('http://localhost:7777/users/validate', user);
  }
addBill(user:Bill) {
   console.log('Inside verhicle service Bill user...'+user.userName+ user.serviceCharge);
     return this.httpClient.post('http://localhost:7777/GenerateBill/addBill', user).subscribe((response) =>{

     });
  }

  showUsers() {
    console.log('Inside verhicle service show users dmethod...')
    return this.httpClient.get('http://localhost:7777/users/showAllUsers');
  }
  showParts() {
    console.log('Inside verhicle service show Parts dmethod...')
    return this.httpClient.get('http://localhost:7777/SpareParts/showAllparts');
  }


addPart(user:Parts) {
    console.log('Inside vehicle service addmethod...'+user.partName);
    this.httpClient.post('http://localhost:7777/SpareParts/addPart', user).subscribe((response) => {
      console.log('Inside angular add service.....');
    });
  }
  
 
 addVehicle(vehicle:VehicleVehicle) {
    console.log('Inside vehicle service addmethod...'+vehicle.vehicleType)
    this.httpClient.post('http://localhost:7777/vehicles/addVehicle', vehicle).subscribe((response) => {
      console.log('Inside angular add service.....');
      });
  }

}