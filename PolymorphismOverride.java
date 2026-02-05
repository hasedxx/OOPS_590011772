class Subject{
    int sum(int a, int b){
        return a+b;
    }
}

class Subject2 extends Subject{
    @Override
    int sum(int a, int b){
        return a-b;
    }
    int Display(){
        int x = super.sum(5,10);
        return x;
    }
}
public class PolymorphismOverride {
    public static void main(String[] args) {
        Subject s = new Subject();
        Subject2 s1 = new Subject2();
        System.out.println("The sum is = "+s.sum(4,8));
        System.err.println(s1.Display());
    }
}
