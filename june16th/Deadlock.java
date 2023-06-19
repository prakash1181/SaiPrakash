package june16th;

public class Deadlock {
    static String s1="xyz";
    public static void main(String [] args){
        Thread t=new T1();
        Thread t1=new T2();
        t.start();
        t1.start();
    }
}
class T1 extends Thread{
    public void run(){
        synchronized(Deadlock.s1){
            System.out.println("T1 using resource s1");
        }
    }
}
class T2 extends Thread{
    public void run(){
          synchronized(Deadlock.s1){
            System.out.println("T2 using resource s1");
        }
    }
}
