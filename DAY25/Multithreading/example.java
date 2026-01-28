package DAY25.Multithreading;
class myThread implements Runnable{
    public void run(){
        System.out.println("thread running");
        System.out.println(Thread.currentThread().getName());
        for(int i= 0;i<=5;i++){
            System.out.print(i+" ");
        }
    }
}
public class example {
    public static void main(String[] args) throws InterruptedException {
        myThread obj1 = new myThread();
        myThread obj2 = new myThread();
        Thread t = new Thread(obj1);
        Thread t1 = new Thread(obj2);
        t.start();
        t.join();

        t.sleep(1000);
        t1.start();
        t1.join();
        System.out.println("end");
    }
}
