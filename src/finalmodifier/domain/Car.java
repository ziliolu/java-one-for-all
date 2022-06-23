package finalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250; //final = means it is a constant and the value can't be changed
    public final Buyer BUYER = new Buyer();

    public final void print(){
        System.out.println("--- print() is a final method ---");
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
