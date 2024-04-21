// Write a java program to define a thread for printing text on output screen for ‘n’
// number of times. Create 3 threads and run them. Pass the text ‘n’ parameters to the
// thread constructor.
//  Example:
// i. First thread prints “COVID19” 10 times.
// ii. Second thread prints “LOCKDOWN2020” 20 times
// iii. Third thread prints “VACCINATED2021” 30 times a

import java.util.*;

class th extends Thread{
    String name;
    int n;

    th(String name , int n){
        this.name = name;
        this.n = n;
    }

    public void run(){
        for(int i = 0 ; i < n ; i++){
                System.out.println(name);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}

class t{
    public static void main(String[]args){
       th t1 = new th("Asadfk",10); 
       th t2 = new th("Bafda",20); 
       th t3 = new th("Cafda",30);

       t1.start(); 
       t2.start(); 
       t3.start(); 
    }
}