// Write a java program to define a thread for printing text on output screen for ‘n’
// number of times. Create 3 threads and run them. Pass the text ‘n’ parameters to the
// thread constructor.
//  Example:
// i. First thread prints “COVID19” 10 times.
// ii. Second thread prints “LOCKDOWN2020” 20 times
// iii. Third thread prints “VACCINATED2021” 30 times 

import java.util.*;
import java.util.Scanner;

class thread extends Thread{
    String str;
    int n;

    thread(String str,int n){
        this.str = str;
        this.n = n;
    }

    public void run(){
        for(int i = 0 ; i < n ;i++){
            System.out.println(str);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println("Error:"+ie);
            }
        }
    }
}

class threadMain{
    public static void main(String[]args){
        thread t1 = new thread("COVID19",10);
        thread t2 = new thread("LOCKDOWN2020",20);
        thread t3 = new thread("VACCINATED",30);

        t1.start();
        t2.start();
        t3.start();
    }
}