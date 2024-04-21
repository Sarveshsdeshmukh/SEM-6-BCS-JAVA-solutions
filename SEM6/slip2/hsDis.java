import java.util.*;
import java.util.Scanner;

class hsDis{
    public static void main(String[]args){
        int i , n;
        String Names;

        HashSet <String>hs = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the Students:");
        n = sc.nextInt();

        System.out.println("Enter the Students Details :");
        for(i = 0 ; i < n ;i++){
            Names = sc.next();
            hs.add(Names);
        }

        System.out.println("Students Details are as follows:");
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 

        System.out.println("Studnets with Asending order:");

        ArrayList<String> al = new ArrayList<String>(hs);
        Collections.sort(al);

        Iterator itr1 = al.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}