package designpatterns.ecommerencecartmanagmnet.observer;

import java.util.ArrayList;
import java.util.List;

public class StockNotifier {

    private static StockNotifier instance;
    private List<Observer> observers = new ArrayList<>();

    private StockNotifier() {}

    public static StockNotifier getInstance() {
        if (instance == null)
            instance = new StockNotifier();

        return instance;
    }

    public void addObserver(Observer obs) { observers.add(obs); }

    public void notifyObservers(String message) {
        for (Observer o : observers) o.update(message);
    }

}
