// Write a Java program to show lifecycle (creation, sleep, and dead) of a thread. Program
// should print randomly the name of thread and value of sleep time. The name of the
// thread should be hard coded through constructor. The sleep time of a thread will be a
// random integer in the range 0 to 4999. 

import java.util.*;

class MyThreadC1 extends Thread{

    MyThreadC1(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread "+getName()+" is Created");
        Random random = new Random();
        int sleeptime = random.nextInt(5000);

        try{
            System.out.println("Thread "+getName()+" is going to sleep in "+sleeptime+" miliseconds!");
            Thread.sleep(sleeptime);
            System.out.println("Thread "+getName()+" is going to dead in "+sleeptime+" miliseconds!");
        }catch(InterruptedException ie){
            System.out.println("Error:"+ie);
        }
    }
}

class MyThread{
    public static void main(String[]args){
        MyThreadC1 t1 = new MyThreadC1("TH1");
        MyThreadC1 t2 = new MyThreadC1("TH2");
        t1.start();
        t2.start();
    }
}