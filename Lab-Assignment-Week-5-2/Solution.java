import java.util.Scanner;

class Employee {
    private final double salary;
    private final String name;

    public Employee(String name, double salary) {
        // COMPLETE
        this.salary = salary;
        this.name = name;
    }   

    @Override
    public String toString() {
        // COMPLETE
        return "Name: " + this.name + ", Salary,: " + getSalary();
    }

    public double getSalary() {
        // COMPLETE
        return this.salary;
    }
}

class Programmer extends Employee {
    private final double bonus;
    private final String specialization;

    public Programmer(String name, double salary, double bonus, String specialization) {
       // COMPLETE
       super(name, salary);
       this.bonus = bonus;
       this.specialization = specialization; 
    }

    @Override
    public double getSalary() {
        // COMPLETE
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "; Programmer for " + this.specialization; 
    }
}

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String in = sc.nextLine();
            if(in.charAt(0) == 'E') {
                String name = new String();
                double sal;
                name = sc.next();
                sal = sc.nextDouble();
                Employee e = new Employee(name, sal);
                System.out.println(e.toString()); 
            } else {
                String name = new String();
                double sal;
                double bonus;
                String specialization = new String();
                name = sc.next();
                sal = sc.nextDouble();
                bonus = sc.nextDouble();
                specialization = sc.nextLine();
                Programmer p = new Programmer(name, sal, bonus, specialization);
                System.out.println(p.toString());
            }
            /*
             * HINT if you get stuck at IO: 
             * recall that sc.nextDouble() reads the next double WITHOUT consuming the next line character.
             */
        }
    }
}