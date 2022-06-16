package staticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    public static double speedLimit = 250;

    /*      static -> means it belongs to the class itself
            if I change the value of a static attribute all the
            objects of this class will be changed as well         */

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("-------------");
        System.out.println("Name: "+ this.name);
        System.out.println("Max speed: "+ this.maxSpeed);
        System.out.println("Speed limit: "+ this.speedLimit);
    }

    public static void setSpeedLimit(double speedLimit){
        Car.speedLimit = speedLimit;
    }
    public static double getSpeedLimit(){
        return Car.speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
