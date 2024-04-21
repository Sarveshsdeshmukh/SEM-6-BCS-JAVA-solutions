import java.util.*;

class LinkedListDemo {
    public static void main(String[] args) {
        int n;
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            list.add(number);
        }

        // System.out.println("List of numbers:");
        // Iterator<Integer> itr = list.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        System.out.println("All negative numbers are as follows:");

        Iterator<Integer> itrr = list.iterator();   
            while (itrr.hasNext()) {
                int x = itrr.next();
                    if (x < 0) {
                        System.out.println(x);
            }
        }
    }
}
