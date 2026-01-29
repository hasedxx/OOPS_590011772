import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
