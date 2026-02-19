import java.util.Scanner;

// Custom Exception Class
class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    int age;
    float salary;

    void inputData() throws InvalidDataException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name (max 20 characters): ");
        name = sc.nextLine();
        if (name.length() > 20) {
            throw new InvalidDataException("Error: Name must not exceed 20 characters.");
        }

        System.out.print("Enter age (greater than 5): ");
        age = sc.nextInt();
        if (age <= 5) {
            throw new InvalidDataException("Error: Age must be greater than 5.");
        }

        System.out.print("Enter salary (greater than 80000): ");
        salary = sc.nextFloat();
        if (salary <= 80000) {
            throw new InvalidDataException("Error: Salary must be greater than 80000.");
        }

        System.out.println("Data inserted successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        try {
            emp.inputData();
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
