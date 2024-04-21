// Write a java program to accept ‘N’ Subject Names from a user store them into
// LinkedList Collection and Display them by using Iterator interface

import java.util.*;
import java.util.Scanner;

class list{
    public static void main(String[]args){
        int i , n;

        LinkedList<String> lt = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students!");
        n = sc.nextInt();

        System.out.println("Enter the data:");
        for(i = 0 ; i < n ; i++){
            String name = sc.next();
            lt.add(name);
        }

        System.out.println("Contents are as follows:");

        Iterator itr = lt.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}