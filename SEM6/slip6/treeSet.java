import java.util.*;
import java.util.Scanner;

class treeSet{
    public static void main(String[]args){
        int i,n,num;
        TreeSet<Integer> tr = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of numbers:");
        n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for(i = 0 ; i < n;i++){
          System.out.println("Enter the "+(i+1)+"Elements");
          num = sc.nextInt();
          tr.add(num);  
        }

        System.out.println("Sorted Unique integer:"+tr);

        System.out.println("Enter the element to search");
        int ele = sc.nextInt();

        if(tr.contains(ele)){
            System.out.println("Present");
        } else{
            System.out.println("Absent");
        }
    }
}