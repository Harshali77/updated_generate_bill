import { Component, OnInit } from '@angular/core';
import { VehicleApplicationService } from '../vehicleapplication/vehicle-application.service';
import { Router } from '@angular/router';
import { FormGroup, Validators,FormControl } from '@angular/forms';
import {Bill} from '../vehicleapplication/Bill';
@Component({
  selector: 'app-generate-bill',
  templateUrl: './generate-bill.component.html',
  styleUrls: ['./generate-bill.component.css']
})
export class GenerateBillComponent implements OnInit {
   newApplication: Bill;
  billForm: FormGroup
  result:any;
  constructor(private vehicleApplicationService: VehicleApplicationService,private router: Router) {

/*cName:string;
serviceCharge: string;
Oiling:string;
spareParts:string;
result:number;*/

this.billForm=new FormGroup(
      {
          userName:new FormControl(),
          userId:new FormControl(),
          serviceCharge: new FormControl(),
          oiling:new FormControl(),
          spareCharge:new FormControl(),
 //totalBill:new FormControl(),
   
    }
);
   }

    
  ngOnInit() {
  }
add() {

    this.newApplication = this.billForm.value;
    
    this.result=parseInt(this.newApplication.serviceCharge)+parseInt(this.newApplication.oiling)+parseInt(this.newApplication.spareCharge);
       this.vehicleApplicationService.addBill(this.newApplication);
      alert("Bill added successfully");
    console.log("total bill is"+this.result);
  }

  

/*newApplication: bill;
  billForm: FormGroup
   constructor(private vehicleApplicationService: VehicleApplicationService,private router: Router) {

this.billForm=new FormGroup(
      {
          cName:new FormControl(),
          serviceCharge: new FormControl(),
          oil:new FormControl(),
          spareCharge:new FormControl(),

    }
);
   }
add(){
  this.result=parseInt(this.serviceCharge)+parseInt(this.Oiling)+parseInt(this.spareCharge);
}
  ngOnInit() {


  }


 /*generateBill() {

    this.newApplication = this.billForm.value;
    
    this.vehicleApplicationService.addPart(this.newApplication);
      alert("Part added successfully");
    this.router.navigate(['/admin-dashboard']);
  }
*/
}