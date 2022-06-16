package staticmodifier.test;

import staticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 270D);
        Car car2 = new Car("Mercedes", 285D);
        Car car3 = new Car("Audi", 290D);

        car1.print();
        car2.print();
        car3.print();

        car1.setSpeedLimit(300);
        car2.print();
    }
}
