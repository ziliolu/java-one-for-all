package enumeration.test;

import enumeration.domain.Customer;
import enumeration.domain.CustomerType;
import enumeration.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Daniel", CustomerType.INDIVIDUAL, PaymentType.CREDIT);
        Customer customer2 = new Customer("Rafael", CustomerType.COMPANY, PaymentType.DEBIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));

    }
}
