class Subject{
    int sum(int a, int b){
        return a+b;
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Subject s = new Subject();

        System.out.println("The sum is = "+s.sum(4,8));
    }
}
