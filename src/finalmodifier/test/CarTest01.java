package finalmodifier.test;

import finalmodifier.domain.Car;
import finalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT); //always call static attributes from the class ("Car", on this case)
        System.out.println(car.BUYER);
        car.BUYER.setName("Luiza");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print(); //print method is final and can't be overwritten
    }
}
