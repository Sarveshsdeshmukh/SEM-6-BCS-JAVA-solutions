import java.util.*;

class AlphaDis extends Thread{
    public void run(){
        char ch = 'A';
        while(ch<='Z'){
        try{
            System.out.println(ch+" ");
            Thread.sleep(1000);
            ch++;
        }catch(InterruptedException ie){
            System.out.println(ie);
            }
        }
    }
}

class AlphaMain{
    public static void main(String[]args){
        new AlphaDis().start();
    }
}