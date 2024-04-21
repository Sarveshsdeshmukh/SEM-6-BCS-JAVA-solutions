// Write a java program to display name of currently executing Thread in multithreading.

import java.util.*;

class thread extends Thread{
    thread(String str){
        super(str);
    }

    public void run(){
        System.out.println("Name of the Thread:"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ie){
            System.out.println("Error:"+ie);
        }
    }
}

class threadMain{
    public static void main(String[]args){
        thread t1 = new thread("A");
        thread t2 = new thread("B");
        thread t3 = new thread("C");

        t1.start();
        t2.start();
        t3.start();
    }
}