package designpatterns.observer;

public interface Subject {

    void registerObserver(Observers observer);

    void removeObserver(Observers observer);

    void notifyObservers();
}
