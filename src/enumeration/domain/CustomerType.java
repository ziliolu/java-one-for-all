package enumeration.domain;

public enum CustomerType {
    INDIVIDUAL(1),
    COMPANY(2),
    START_UP(3);

    private final int VALUE;
    CustomerType(int value) {
        this.VALUE = value;
    }

    public int getVALUE() {
        return VALUE;
    }
}
