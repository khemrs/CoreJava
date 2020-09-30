package classPractice.MultiThread;

public class ThreadWithoutSynchronizedCounter {


    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();

        Thread t1=new Thread(new Runnable(){

        @Override

        public void run() {
              //  System.out. println(Thread.currentThread().getName());

        for(int i=1;i<=1000;i++) {

            c.increment ();
        }};


        Thread t2= new Thread (new Runnable() {

            @Override

            public void run() {

                for(int i=1;i<=1000;i++){
                    c.increment();
                }})


        t1.start();
        t2.start()
        t1.join();
        t2.join();
        System.out.println(c.count());


})});}}