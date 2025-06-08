public class Task039 {
    public static void main(String[] args) {
        // Create a Salary object
        Employees e = new Salary("George W.", "Houston, TX", 43, 120000.0);

        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
        System.out.println("Monthly Pay: Rs" + e.computePay());
    }
}

// Abstract class
abstract class Employees {
    private String name;
    private String address;
    private int number;

    public Employees(String name, String address, int number) {
        System.out.println("Creating an Employee document");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Now we are inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " at " + address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}

// Concrete subclass
class Salary extends Employees {
    private double annualSalary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);  // Call constructor of Employee
        this.annualSalary = salary;
    }

    // Override computePay method
    @Override
    public double computePay() {
        System.out.println("Computing salary for " + getName());
        return annualSalary / 12;  // Monthly salary
    }

    // Override mailCheck method
    @Override
    public void mailCheck() {
        System.out.println("Mailing paycheck to " + getName() + " with salary $" + annualSalary);
    }
}