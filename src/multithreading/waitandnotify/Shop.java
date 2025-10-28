package multithreading.waitandnotify;

public class Shop {

    private String coffee;
    private boolean isReady = false;

    public synchronized void makeCoffee() {

        System.out.println("Customer: Waiting for coffee...");

        System.out.println("Barista: Coffee preparation started...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        coffee = "Cappuccino";
        isReady = true;
        System.out.println("Barista: Coffee is ready!");

        notify();
    }

    public synchronized void drinkCoffee() {


        while (!isReady) {
            try {

                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Customer: Enjoying my " + coffee + " ☕");
        isReady = false;
    }
}
