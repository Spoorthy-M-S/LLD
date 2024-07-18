package DesignPatterns.p2ObserverdesignPattern.observer;

import DesignPatterns.p2ObserverdesignPattern.observable.StockObserable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailid;
    StockObserable observable;

//construction Injection
    public EmailAlertObserverImpl(String mailId,StockObserable observable){
        this.observable=observable;
        this.emailid=mailId;
    }

    @Override
    public void update() {
        sendMail(emailid, "Product is in stock hurry Up!");
    }

    private void sendMail(String emailId,String msg){
        System.out.println("Mail sent to "+emailId);
    }
    
}
