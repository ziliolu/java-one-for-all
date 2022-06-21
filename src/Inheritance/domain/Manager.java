package Inheritance.domain;

public class Manager extends Employee {
    private String department;

    public Manager(){
        super();
    }
    public Manager(String name){
        super(name);

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
