import java.util.Scanner;
class Num {
    int n;
}
public class ClassNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num a = new Num();
        System.out.print("Enter the value of n = ");
        a.n = sc.nextInt();
        System.err.println("The entered value of n is = "+a.n);
    }
}
