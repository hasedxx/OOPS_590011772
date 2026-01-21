import java.util.Scanner;

public class sum_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, n, sum = 0;
        System.out.println("Enter the number of elements = ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i = 0; i<n; i++){
            System.out.println("Enter the elements = ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of n numbers are = " + sum);
        sc.close();
}
}