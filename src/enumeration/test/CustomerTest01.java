package enumeration.test;

import enumeration.domain.Customer;
import enumeration.domain.CustomerType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Daniel", CustomerType.INDIVIDUAL);
        Customer customer2 = new Customer("Rafael", CustomerType.COMPANY);
        Customer customer3 = new Customer("ALICE", CustomerType.START_UP);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

    }
}
