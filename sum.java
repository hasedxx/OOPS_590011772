import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int arr[] = new int[5];

        // Input array elements
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        // Print first element
        System.out.println(arr[0]);

        s.close();
    }
}
