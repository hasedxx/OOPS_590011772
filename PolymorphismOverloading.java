class Subject{
    int sum(int a, int b){
        return a+b;
    }

    int sum(int c, int d, int e){
        return c+d+e;
    }
}
public class PolymorphismOverloading {
    public static void main(String[] args) {
        Subject s = new Subject();

        System.out.println("The sum is = "+s.sum(4,8));
        System.out.println("The sum is = "+s.sum(5,6,7));
    }
}
