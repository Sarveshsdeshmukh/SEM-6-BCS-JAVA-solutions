// Write a Java program to create LinkedList of String objects and perform the following:
// i. Add element at the end of the list
// ii. Delete first element of the list
// iii. Display the contents of list in reverse order

import java.util.*;
import java.util.Scanner;

class linked{
    public static void main(String[]args){
        int i,n;
        String name;
        int choice;

        LinkedList<String> lt = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1:Add element last");
            System.out.println("2:Delete First");
            System.out.println("3:Reverse Order");
            System.out.println("4:Display");
            System.out.println("5:Exit");

            System.out.println("Enter the choice:");
            choice = sc.nextInt();

            switch(choice){
                case 1:System.out.println("Enter the name of the String");
                        name = sc.next();
                        lt.add(name);
                        break;

                case 2:lt.removeLast();
                        break;
                
                case 3:ListIterator itr = lt.listIterator();
                        while(itr.hasPrevious()){
                            System.out.println(itr.previous());
                        }
                        break;
                
                case 4:ListIterator itr1 = lt.listIterator();
                        while(itr1.hasNext()){
                            System.out.println(itr1.next());
                        }
                        break;

                case 5:System.exit(0);

            }
        }while(choice!=5);



    }
}