package multithreading.waitandnotify;

public class MyShop {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Thread thread1 = new Thread( () -> shop.makeCoffee()) ;
        Thread thread2 = new Thread( () -> shop.drinkCoffee()) ;

        thread1.start();
        thread2.start();


    }
}
