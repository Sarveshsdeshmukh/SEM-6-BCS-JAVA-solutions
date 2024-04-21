// Write a java program that implements a multi-thread application that has three threads.
// First thread generates random integer number after every one second, if the number is
// even; second thread computes the square of that number and print it. If the number is
// odd, the third thread computes the of cube of that number and print it

import java.util.*;

class thread extends Thread{
    public void run(){
        Random r = new Random();

        while(true){
            try{
                int no = r.nextInt(100);
                if(no % 2 ==  0){
                    SquareThread st = new SquareThread(no);
                    st.start();
                }else{
                    CubeThread ct = new CubeThread(no);
                    ct.start();
                }
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}

class SquareThread extends Thread{
    int no;
    SquareThread(int no){
        this.no = no;
    }
    public void run(){
        System.out.println("Square:"+no*no);
    }
}

class CubeThread extends Thread{
    int no;
    CubeThread(int no){
        this.no = no;
    }

    public void run(){
        System.out.println("Cube:"+no*no*no);
    }
}

class threadMain{
    public static void main(String[]args){
        thread t = new thread();
        t.start();
    }
}