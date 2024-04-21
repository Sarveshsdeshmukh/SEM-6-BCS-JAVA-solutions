import java.util.*;

class dis extends Thread{
    public void run(){
        char ch = 'A';
        while(ch <= 'Z'){
            try{
                System.out.print(ch+"  ");
                Thread.sleep(1000);
                ch++;
            }catch(InterruptedException ie){
                System.out.println("Error"+ie);
            }
        }
    }
}

class display{
    public static void main(String[]args){
        new dis().start();
    }
}