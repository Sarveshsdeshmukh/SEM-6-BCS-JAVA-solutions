import java.util.*;
import java.util.Scanner;

class linkedList{
    public static void main(String[]args){
        int i , n ,x;
        int number;

        LinkedList<Integer> Link = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("1:Add Element at first");
            System.out.println("2:Delete Last Element");
            System.out.println("3:Display size of list");
            System.out.println("4:Display list");
            System.out.println("5:Exit!!");

            System.out.println("Enter the Choice:");
            choice = sc.nextInt();

            switch(choice){
                case 1:System.out.println("Enter the Element to insert at first position:");
                    x = sc.nextInt();
                    Link.addFirst(x);
                    System.out.println(Link);
                    break;
                case 2:Link.removeLast();
                    System.out.println(Link);
                    break;
                case 3:System.out.println("Size of Linkedlist"+Link.size());
                    break;
                case 4:System.out.println("Contents of List :");
                    Iterator itr = Link.iterator();
                    while(itr.hasNext()){
                        System.out.println(itr.next());
                    }
                    break;
            }

        }while(choice!=5);
    }
}