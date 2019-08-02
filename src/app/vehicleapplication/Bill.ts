export class Bill {
 userId:number;
    userName: string;
    serviceCharge: number;
    oiling: number;
    spareCharge:number;
   // totalBill:number;
   
    constructor(values: Object = {}) {
      Object.assign(this, values);
    }
}