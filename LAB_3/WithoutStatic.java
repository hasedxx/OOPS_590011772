import java.util.Scanner;
class With{
    int n;
}
public class WithoutStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n = ");
        n = sc.nextInt();
        System.err.println("The entered value of n is = "+n);
    }
}
