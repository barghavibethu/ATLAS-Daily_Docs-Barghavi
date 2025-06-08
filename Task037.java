class Employee {
    private int pwd;
    protected int salary;
    public int empid;

    Employee() { // constructors are methods having same name as clas name  (we have in c++)
        System.out.println("Employee Details");
    }
}

class Task037 extends Employee {
    Task037() {
        super();
        this.salary = 50000;
        this.empid = 10001;
    }

    public static void main(String[] args) {
        Task037 obj = new Task037();
        System.out.println("EmployeeID: " + obj.empid);
        System.out.println("Salary: " + obj.salary);
    }
}
