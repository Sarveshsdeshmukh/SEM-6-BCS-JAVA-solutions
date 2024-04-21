// 1. Write a java program to display name and priority of a Thread. 

import java.util.*;

class threadDisplay{
    public static void main(String[]args){
        Thread t1 = Thread.currentThread();

        System.out.println("The name of the Thread "+t1.getName());

        t1.setName("Sarvesh");

        System.out.println("The name of the Thread "+t1.getName());
        
        System.out.println("The priority of the Thread "+t1.getPriority());

        t1.setPriority(10);

        System.out.println("The priority of the Thread "+t1.getPriority());
    }
}