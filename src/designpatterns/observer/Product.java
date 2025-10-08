package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

    private String productName;
    private boolean inStoke ;
    private List<Observers> observers = new ArrayList<>();

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public void registerObserver(Observers observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observers observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observers observers1 : observers){
            observers1.update(productName);
        }
    }

    public void setInStoke(boolean inStoke)
    {
        this.inStoke = inStoke;

        if(inStoke){
            System.out.println(productName +" Is In STOKE");
            notifyObservers();
        }
        else{
            System.out.println(productName +" Is Out OF STOKE");
        }
    }

}
