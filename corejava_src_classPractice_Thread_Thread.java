package classPractice.Thread;

public class Thread {

    public static void main(String[] args) {
            Thread mainThread=Thread.currentThread(); //see the current main thread...





            System.out.println("Main Thread Id : "+ mainThread.getId()+"\n Main " + "Thread Name : : " + mainThread.getName());

//Create a user Thread (fork a Thread)

//Thread ID creation:

            Thread t1=new Thread();

            t1.setName("UserThread");
            t1.start();
            System.out. println(" User Thread Id: "+ t1.getId()+"\n User " + "Thread Name:"+t1.getName());

}
///


}
