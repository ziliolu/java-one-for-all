package finalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250; //final = means it is a constant and the value can't be changed

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
