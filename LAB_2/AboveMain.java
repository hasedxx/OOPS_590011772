import java.util.Scanner;
public class AboveMain {
    int a = 10;
    int b = 20;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        AboveMain obj = new AboveMain();
        int sum = obj.a + obj.b;
        int diff = obj.a - obj.b;
        System.err.println("The Sum is = "+sum);
        System.err.println("The Difference is = "+diff);

    }
}

