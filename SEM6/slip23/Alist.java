// Write a java program to accept ‘N’ student names through command line, store them
// into the appropriate Collection and display them by using Iterator and ListIterator
// interface

import java.util.*;
import java.io.*;

class Alist{
    public static void main(String[]args){
        int i;
        String name;

        ArrayList<String> al = new ArrayList<>();
        for(i=0;i<args.length;i++){
            name = args[i];
            al.add(name);
        }

        System.out.println("The Contents of the Arraylist is follows:");

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        
        ListIterator itr1 = al.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }


}