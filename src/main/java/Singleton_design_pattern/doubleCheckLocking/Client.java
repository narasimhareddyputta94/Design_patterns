package Singleton_design_pattern.doubleCheckLocking;

public class Client {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            DataBaseConnection connection1 = DataBaseConnection.getInstance();
            connection1.connect();
        });

        Thread thread2 = new Thread(() -> {
            DataBaseConnection connection2 = DataBaseConnection.getInstance();
            connection2.disconnect();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main");


    }
}
