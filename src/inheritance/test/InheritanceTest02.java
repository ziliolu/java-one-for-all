package inheritance.test;

import inheritance.domain.Manager;

public class InheritanceTest02 {
    public static void main(String[] args) {
        new Manager("Luiza");
    }
}


    /*  INITIALIZATION ORDER

        Inside STATIC employee initialization block
        Inside STATIC manager initialization block
        Inside employee initialization block 1
        Inside employee initialization block 2
        Inside employee constructor
        Inside manager initialization block 1
        Inside manager initialization block 2
        Inside manager constructor               */
