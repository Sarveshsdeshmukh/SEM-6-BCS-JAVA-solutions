// Write a Java program to store city names and their STD codes using an appropriate
// collection and perform following operations:
// i. Add a new city and its code (No duplicates)
// ii. Remove a city from the collection
// iii. Search for a city name and display the code

import java.util.*;
import java.util.Scanner;

class tr{
    public static void main(String[]args){

        int i , n;
        String code,city ;
        int choice;

        HashMap<String,String> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1:Add new city");
            System.out.println("2:Remove city");
            System.out.println("3:Search city");
            System.out.println("4:Display");
            System.out.println("5:Exit");

            System.out.println("Enter choice");
            choice = sc.nextInt();

            switch(choice){
                case 1:System.out.println("Enter the city name:");
                    city = sc.next();
                    System.out.println("Enter the city code:");
                    code = sc.next();
                    if(hm.containsKey(city)){
                        System.out.println("Already Exists!");
                    }else{
                        hm.put(city,code);
                        System.out.println("Added Successfully!");
                    }
                    break;
                
                case 2:System.out.println("Enter the city name to delete:");
                    city = sc.next();
                        if(hm.containsKey(city)){
                            hm.remove(city);
                            System.out.println("Deleted Successfully!!");
                        }else{
                            System.out.println("City not found!");
                        }                    
                    break;
                
                case 3:System.out.println("Enter the city name to search:");
                    city = sc.next();
                        if(hm.containsKey(city)){
                            System.out.println("City Found . Code : "+hm.get(city));
                        }else{
                            System.out.println("City not found!");
                        }                    
                    break;
                
                   case 4:
                    Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
                    while (itr.hasNext()) {
                        Map.Entry<String, String> entry = itr.next();
                        System.out.println("City: " + entry.getKey() + ", Code: " + entry.getValue());
                    }
                    break;
                
                case 5:System.exit(0);
            }

        }while(choice!=5);
    }
}