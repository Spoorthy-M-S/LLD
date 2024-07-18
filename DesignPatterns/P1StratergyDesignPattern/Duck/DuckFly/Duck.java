package DesignPatterns.P1StratergyDesignPattern.Duck.DuckFly;

public class Duck {
    duckFlyStr flyob;
    Duck(duckFlyStr f){
        this.flyob=f;
    }
    public void fly(){
        flyob.fly();
    }
    
}
