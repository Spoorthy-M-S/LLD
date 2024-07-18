package LLD.S1SOLIDprinciples.LPrinciple;

class Motorcycle implements Bike{
    boolean isEnginrOn;
    int speed;
    public void turnOnEngine(){
        isEnginrOn=true;
    }
    public void accelerate(){
        speed+=10;
    }
}