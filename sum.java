import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            while (!s.hasNextInt()) {
                System.out.println("Please enter a valid integer:");
                s.next(); 
            }
            arr[i] = s.nextInt();
        }

        System.out.println("First element is: " + arr[0]);
        s.close();
    }
}
