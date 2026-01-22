import java.util.Scanner;
public class ClassArraySum {
    int sum = 0, arr[] = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassArraySum obj = new ClassArraySum();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            obj.arr[i] = sc.nextInt();
            obj.sum += obj.arr[i];
        }
        System.out.println("Sum = " + obj.sum);
    }
}
