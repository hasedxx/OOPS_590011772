import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;

    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name (max 20 characters): ");
        name = sc.nextLine();

        System.out.print("Enter age (greater than 5): ");
        age = sc.nextInt();

        System.out.print("Enter salary (greater than 80000): ");
        salary = sc.nextFloat();

        if (name.length() <= 20 && age > 5 && salary > 80000) {
            System.out.println("Data inserted successfully");
        } else {
            System.out.println("Error: Conditions not satisfied");
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputData();
    }
}
