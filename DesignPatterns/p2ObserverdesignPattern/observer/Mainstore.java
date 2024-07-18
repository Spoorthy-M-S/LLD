package DesignPatterns.p2ObserverdesignPattern.observer;

import DesignPatterns.p2ObserverdesignPattern.observable.IphoneObserable;
import DesignPatterns.p2ObserverdesignPattern.observable.StockObserable;

class Mainstore{
    public static void main(String[] args) {
        StockObserable iphone=new IphoneObserable();
        NotificationAlertObserver ob1=new EmailAlertObserverImpl("xyz@gmail.com", iphone);
        NotificationAlertObserver ob2=new EmailAlertObserverImpl("jki@gmail.com", iphone);
        NotificationAlertObserver ob3=new MobileAlert("9906",iphone);

        iphone.add(ob1);
        iphone.add(ob2);
        iphone.add(ob3);
        iphone.setStockCount(10);
    }
    
}