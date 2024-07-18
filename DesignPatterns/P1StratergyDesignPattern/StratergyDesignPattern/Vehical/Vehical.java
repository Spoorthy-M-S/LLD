package DesignPatterns.P1StratergyDesignPattern.StratergyDesignPattern.Vehical;

public class Vehical {
    DriveStratergy driveobject;//=>if initilized here not scalable
    //this is known as Constructor injection 
    Vehical(DriveStratergy driveObj){
        this.driveobject=driveObj;
    }
    public void drive(){
        driveobject.drive();
    }
}
