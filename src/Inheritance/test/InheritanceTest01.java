package Inheritance.test;

import Inheritance.domain.Address;
import Inheritance.domain.Employee;
import Inheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Address address = new Address();
        Manager manager = new Manager();

        //address
        address.setStreet("12th Avenue");
        address.setZipcode("12345");

        //employee
        employee.setName("Marcos");
        employee.setSocialSecurityNumber("12121212");
        employee.setSalary(2000.0);
        employee.setAddress(address);

        //manager
        manager.setName("Mary");
        manager.setSocialSecurityNumber("444484");
        manager.setSalary(1000.0);
        manager.setAddress(address);
        manager.setDepartment("IT");

        employee.print();
        manager.print();
        manager.paymentReport();

    }
}
