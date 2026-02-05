class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Value using this keyword = " + this.x);
        System.out.println("Value using super keyword = " + super.x);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
