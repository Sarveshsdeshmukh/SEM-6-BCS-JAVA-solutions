// Write a java program to read ‘N’ names of your friends, store it into HashSet and
// display them in ascending order.

import java.util.*;
import java.util.Scanner;

class hs{
    public static void main(String[]args){
        int i , n;
        String name;

        HashSet<String> hs = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of friends:");
        n = sc.nextInt();

        System.out.println("Enter the Students Records:");
        for(i = 0 ; i < n ;i++){
            name = sc.next();
            hs.add(name);
        }

        System.out.println("Asending Order");

        ArrayList<String> al = new ArrayList<String>(hs);
        Collections.sort(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}