abstract class sample{
   int a=10;
   void display() {
    System.out.println(a);
   }
}
class child extends sample{
    void show() {
        super.display();
    }
    void d2(){
        System.out.println("Done");
    }
}

public class abstraction {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.d2();
        
    }
}