package designpatterns.onlinefoodorderingsystem.singleton;


// singleton class
public class DBConnection {

    private DBConnection(){
        System.out.println("DB connection is established....");
    }

    private DBConnection instance;

    public DBConnection getInstance(){
        if(instance == null)
            instance = new DBConnection();
        return instance;
    }


}
