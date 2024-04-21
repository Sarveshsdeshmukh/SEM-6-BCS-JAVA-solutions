// Write a java program to create a TreeSet, add some colors (String) and print out the
// content of TreeSet in ascending order. 

import java.util.*;
import java.util.Scanner;

class treeSet{
    public static void main(String[]args){
        int i,n;
        String color;

        TreeSet<String> tr = new TreeSet<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of Colors:");
        n = sc.nextInt();

        System.out.println("Enter the name colors:");
        for(i = 0 ; i < n ; i++){
            System.out.println("Enter the "+ (i+1) +" color");
            color = sc.next();
            tr.add(color);
        }

        System.out.println("Color in Asending order:");
        System.out.println(tr);

        Iterator itr = tr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Enter the color to check:");
        String co = sc.next();

        if(tr.contains(co)){
            System.out.println("Present");
        }else{
            System.out.println("Absent");
        }
    }
}