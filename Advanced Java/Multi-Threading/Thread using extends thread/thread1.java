public class thread1 extends Thread {
    public static void main(String[] args) {
      thread1 thread = new thread1();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }