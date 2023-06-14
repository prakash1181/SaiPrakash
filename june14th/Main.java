package june14th;

 class Thread1 extends Thread {
        @Override
        public void run() {
            for(int i = 1; i < 11; i++) {
                System.out.println("Thread Class - " +i);
            }
        }
    }
class RunnableImpl implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i < 11; i++) {
            System.out.println("Runnable - " +i);
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();

        RunnableImpl runnable = new RunnableImpl();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}

