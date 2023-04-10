public class thread2 implements Runnable {
    public static void main(String[] args) {
        thread2 obj = new thread2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}