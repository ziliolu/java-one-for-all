package enumeration.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start up");

    private final int VALUE;
    private String reportValue;

    public static CustomerType getByReportValue(String reportValue){
        for (CustomerType customerType : values()){
            if(customerType.getReportValue().equalsIgnoreCase(reportValue)){
                return customerType;
            }
        }
        return null;
    }

    CustomerType(int value, String reportValue) {
        this.VALUE = value;
        this.reportValue = reportValue;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getReportValue() {
        return reportValue;
    }

    public void setReportValue(String reportValue) {
        this.reportValue = reportValue;
    }




}
