package inheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    static {
        System.out.println("Inside STATIC employee initialization block");
    }
    {
        System.out.println("Inside employee initialization block 1");
    }
    {
        System.out.println("Inside employee initialization block 2");
    }

    public Employee(){

    }
    public Employee(String name){
        System.out.println("Inside employee constructor");
        this.name= name;
    }

    public void print(){
        System.out.println("------------");
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.salary);
        System.out.println(this.address.getStreet() + " " + this.address.getZipcode());
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
