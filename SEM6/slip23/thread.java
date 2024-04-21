import java.util.*;
import java.util.Scanner;

class ThreadMain extends Thread{
    String str;

    ThreadMain(String str){
        this.str = str;
    }

    public void run(){
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);

            if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')||(ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U')){
                System.out.println(ch);

                try{
                    Thread.sleep(3000);
                }catch(InterruptedException ie){
                    System.out.println("Error:"+ie);
                }
            }
        }
    }

}

class thread{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.println("Enter the String");
        str = sc.next();

        ThreadMain t1 = new ThreadMain(str);
        t1.start();
    }
}