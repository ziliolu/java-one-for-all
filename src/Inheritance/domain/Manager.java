package Inheritance.domain;

public class Manager extends Employee {
    private String department;

    static {
        System.out.println("Inside STATIC manager initialization block");
    }
    {
        System.out.println("Inside manager initialization block 1");
    }
    {
        System.out.println("Inside manager initialization block 2");
    }

    public Manager(){
        super();
    }
    public Manager(String name){
        super(name);
        System.out.println("Inside manager constructor");

    }
    @Override
    public void print(){
        super.print();
        System.out.println(this.department);
    }

    public void paymentReport(){
        System.out.println("------ Payment Report ------");
        System.out.println("The employee " + this.name + " from the department " +
                this.department + " received a salary of " + this.salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
