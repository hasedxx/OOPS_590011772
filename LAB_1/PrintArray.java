import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.err.print("Enter the number of elements of array = ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array= ");
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Elements of the array are = ");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
