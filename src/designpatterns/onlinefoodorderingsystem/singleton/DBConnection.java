package designpatterns.onlinefoodorderingsystem.singleton;


// singleton class
public class DBConnection {

    private DBConnection(){
        System.out.println("DB connection is established....");
    }

    private static DBConnection instance;

    public static DBConnection getInstance(){
        if(instance == null)
            instance = new DBConnection();
        return instance;
    }


}
