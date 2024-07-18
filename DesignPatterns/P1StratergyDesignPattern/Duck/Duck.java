package DesignPatterns.P1StratergyDesignPattern.Duck;

public class Duck {
    DuckQuack q;
    Duck(DuckQuack q){
        this.q=q;
    }
    public void Quac(){
        q.Quac();
    }
}
