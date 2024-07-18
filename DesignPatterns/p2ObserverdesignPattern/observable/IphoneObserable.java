package DesignPatterns.p2ObserverdesignPattern.observable;

import java.util.*;

import DesignPatterns.p2ObserverdesignPattern.observer.*;

public class IphoneObserable implements StockObserable {
    public List<NotificationAlertObserver> observerlist = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerlist.add(observer);
    }
    public void remove(NotificationAlertObserver observer) {
        observerlist.remove(observer);
    }
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : observerlist) {
            observer.update();
        }
    }
    public void setStockCount(int newstakeHolder) {
        if (stockCount == 0) {
            notifySubscriber();
        }
        stockCount = stockCount + newstakeHolder;
    }
    public int getStockCount() {
        return stockCount;
    }
}
