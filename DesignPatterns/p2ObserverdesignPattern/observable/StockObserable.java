package DesignPatterns.p2ObserverdesignPattern.observable;
import DesignPatterns.p2ObserverdesignPattern.observer.*;

public interface StockObserable{
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void  notifySubscriber();
    public void setStockCount(int newstakeHolder);
    public int getStockCount();
}
