import java.util.*;

class threadDis{
    public static void main(String[]args){
        Thread thread = Thread.currentThread();

        System.out.println(thread);
        System.out.println("Thread Name:"+thread.getName());
        System.out.println("Thread Priorty:"+thread.getPriority());

        thread.setName("Sarvesh");
        thread.setPriority(10);

        System.out.println(thread);
        System.out.println("Thread Name:"+thread.getName());
        System.out.println("Thread Priorty:"+thread.getPriority());

    }
}