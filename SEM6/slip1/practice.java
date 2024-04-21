import java.util.*;

class practice1 extends Thread{
    public void run(){
        char ch = 'A';
        
        while(ch <=  'Z'){
            try{
                System.out.println("Ch :"+ch);
                Thread.sleep(1000);
                ch++;
            }catch(InterruptedException ie){
                System.out.println("Error"+ie);
            }
        }
    }
}
class practice{
public static void main(String[]args){
    new practice1().start();
}

}