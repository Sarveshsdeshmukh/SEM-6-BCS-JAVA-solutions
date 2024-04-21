// Write a Java program to accept ‘n’ integers from the user and store them in a collection.
// Display them in the sorted order. The collection should not accept duplicate elements.
// (Use a suitable collection). Search for a particular element using predefined search
// method in the Collection framework.

import java.util.*;
import java.util.Scanner;

class tr{
    public static void main(String[]args){
        int i , n;

        TreeSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        n = sc.nextInt();

        System.out.println("Enter the elements:");
        for(i=0;i<n;i++){
            int no = sc.nextInt();
            ts.add(no);
        }

        System.out.println("Elements in sorted order:");

        Iterator litr = ts.iterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println("Enter the number to search:");
        int search = sc.nextInt();

        if(ts.contains(search)){
            System.out.println("Present!");
        }else{
            System.out.println("Absent!");            
        }
    }
}