import java.util.*;

class hashDis {
    public static void main(String[] args) {
        int i, n;
        Hashtable<String, String> hs = new Hashtable<String, String>();
        Scanner sc = new Scanner(System.in);
        String name, number;

        System.out.println("Enter the number of Students:");
        n = sc.nextInt();

        System.out.println("Enter the Details of the Students:");
        for (i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            name = sc.next();
            System.out.print("Enter Mobile Number: ");
            number = sc.next();
            hs.put(name, number);
        }

        System.out.println("Details of the Students :");
        Enumeration<String> names = hs.keys();
        while (names.hasMoreElements()) {
            String studentName = names.nextElement();
            String studentNumber = hs.get(studentName);
            System.out.println("Name: " + studentName + ", Mobile Number: " + studentNumber);
        }
    }
}
