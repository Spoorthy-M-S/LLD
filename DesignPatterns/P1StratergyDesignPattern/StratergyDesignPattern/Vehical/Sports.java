package DesignPatterns.P1StratergyDesignPattern.StratergyDesignPattern.Vehical;

public class Sports extends Vehical {
    Sports(){
        super(new SpecialDrive());
    }
}

