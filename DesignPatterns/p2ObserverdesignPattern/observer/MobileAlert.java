package DesignPatterns.p2ObserverdesignPattern.observer;

import DesignPatterns.p2ObserverdesignPattern.observable.StockObserable;


    public class MobileAlert implements NotificationAlertObserver{
    String Mobile;
    StockObserable observable;

//construction Injection
    public MobileAlert(String mobileNo,StockObserable observable){
        this.observable=observable;
        this.Mobile=mobileNo;
    }

    @Override
    public void update() {
        sendMail(Mobile, "Product is in stock hurry Up!");
    }

    private void sendMail(String mobile,String msg){
        System.out.println("Msg sent to "+mobile);
    }
    
}
