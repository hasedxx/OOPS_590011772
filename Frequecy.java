import java.util.Scanner;
public class Frequecy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The frequency of the elements are = ");
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                count++;
                arr[j] = Integer.MIN_VALUE; // Mark as counted
            }
        }
        if (arr[i] != Integer.MIN_VALUE) {
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
}
