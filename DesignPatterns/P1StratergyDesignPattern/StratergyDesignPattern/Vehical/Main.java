package DesignPatterns.P1StratergyDesignPattern.StratergyDesignPattern.Vehical;

public class Main {
    public static void main(String[] args) {
        Vehical v1=new Sports();
        v1.drive();
        Vehical v2=new offRoad();
        v2.drive();
    }
    
}
