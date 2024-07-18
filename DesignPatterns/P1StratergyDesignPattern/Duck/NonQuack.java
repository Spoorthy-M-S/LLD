package DesignPatterns.P1StratergyDesignPattern.Duck;

public class NonQuack implements DuckQuack{

    @Override
    public void Quac() {
        System.out.println("Not quacks");
    }
    
}
