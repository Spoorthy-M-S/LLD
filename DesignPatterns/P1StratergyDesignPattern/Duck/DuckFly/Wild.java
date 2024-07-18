package DesignPatterns.P1StratergyDesignPattern.Duck.DuckFly;

import DesignPatterns.P1StratergyDesignPattern.Duck.Quacks;

public class Wild extends Duck{
    Wild(){
        super(new flys());
    }
}
