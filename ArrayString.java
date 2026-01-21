import java.util.Scanner;
public class ArrayString {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        System.out.println("Enter the " + n + " strings = ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("The entered strings are = ");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
