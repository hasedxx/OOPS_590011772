import java.util.Scanner;
class Num {
    static int n;
}
public class Static01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        Num.n = sc.nextInt();
        System.out.println("The entered value of n is = " + Num.n);
    }
}
