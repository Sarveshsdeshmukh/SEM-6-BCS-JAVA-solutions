// Write a Java Program to create the hash table that will maintain the mobile number and
// student name. Display the details of student using Enumeration interface.

import java.util.*;
import java.util.Scanner;

class table{
    public static void main(String[]args){
        int i,n;

        Hashtable<String,String> ht = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of records");
        n = sc.nextInt();

        System.out.println("Enter the data:");
        for(i = 0 ; i < n ; i++){
            String no = sc.next();
            String name = sc.next();
            ht.put(no,name);
        }

        System.out.println("The data is as follows:");
        Enumeration<String> names = ht.keys();
        while (names.hasMoreElements()) {
            String studentName = names.nextElement();
            String studentNumber = ht.get(studentName);
            System.out.println("Name: " + studentName + ", Mobile Number: " + studentNumber);
        }
    }
}