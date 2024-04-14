package Singleton_design_pattern.eagerLoading;

public class DataBaseConnection {
    private static DataBaseConnection instance = new DataBaseConnection();

    private DataBaseConnection() {
        // private constructor to prevent instantiation
    }

    public static DataBaseConnection getInstance() {

        return instance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
