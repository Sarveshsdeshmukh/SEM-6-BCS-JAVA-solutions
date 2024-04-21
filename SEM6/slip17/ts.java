// Write a java program to accept ‘N’ integers from a user. Store and display integers in
// sorted order having proper collection class. The collection should not accept duplicate
// elements. 

import java.util.*;

class ts{
    public static void main(String[]args){
        int i,n;

        TreeSet<Integer> tr = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        n = sc.nextInt();

        System.out.println("Enter the Reocrds:");
        for(i = 0 ; i < n ; i++){
            int num = sc.nextInt();

            if(tr.contains(num)){
                System.out.println("Element Already Exists:");
            }else{
            tr.add(num);
            }
        }

        System.out.println("The contents of the treeset:");
        Iterator litr = tr.iterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        
    }
}