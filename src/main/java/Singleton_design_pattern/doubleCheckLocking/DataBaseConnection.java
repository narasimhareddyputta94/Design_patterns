package Singleton_design_pattern.doubleCheckLocking;

public class DataBaseConnection {
    private static DataBaseConnection instance = null;

    private DataBaseConnection() {
        // private constructor to prevent instantiation
    }

    public static DataBaseConnection getInstance() {
        if (instance == null) {
            synchronized (DataBaseConnection.class) {
                if (instance == null) {
                    instance = new DataBaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
