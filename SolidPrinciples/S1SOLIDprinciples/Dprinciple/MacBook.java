package LLD.S1SOLIDprinciples.Dprinciple;

//Class should depend on interface rather than concreate class

public class MacBook {
    public connection mouse;
    public connection keyboard;

    MacBook(connection mouse, connection keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}

interface connection {
    public void connectiona(connection c);

}

class wired implements connection {
    connection c;

    public void connectiona(connection c) {
        this.c = c;
    }

}

class nonwired {
    connection c;

    public void connectiona(connection c) {
        this.c = c;
    }

}