import java.util.Scanner;

class Employee {

        String name;
    int id;
    String department;
    double basicsalary;

    double DA, HRA, TA, grosssalary;

       void read_Employee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name:");
        name = sc.nextLine();

        System.out.print("Enter Employee ID:");
        id = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.print("Enter Department:");
        department = sc.nextLine();

        System.out.print("Enter Basic Salary:");
        basicsalary = sc.nextDouble();
    }

       void calculateSalary() {
        DA = 0.50 * basicsalary;
        HRA = 0.30 * basicsalary;
        TA = 0.10 * basicsalary;

        grosssalary = basicsalary+ DA+ HRA + TA;
    }

        void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name:" + name);
        System.out.println("ID:" + id);
        System.out.println("Department:" + department);
        System.out.println("Basic Salary:" + basicsalary);
        System.out.println("DA:" + DA);
        System.out.println("HRA:" + HRA);
        System.out.println("TA:" + TA);
        System.out.println("Gross Salary:" + grosssalary);
    }
}

public class Emain {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.read_Employee();
        emp.calculateSalary();
        emp.display();
    }
}