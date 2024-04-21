import java.util.*;
import java.util.Scanner;

class subjectList{
    public static void main(String[]args){
        int n , i;
        String Sub;

        LinkedList<String>subjects = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Subjects:");
        n = sc.nextInt();

        System.out.println("Enter the name of the Students:");
        for(i = 0 ; i < n ; i++){
            Sub = sc.next();
            subjects.add(Sub);
        }

        System.out.println("The Name of the Students are as follows:");

        Iterator itr = subjects.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 
    }
}
