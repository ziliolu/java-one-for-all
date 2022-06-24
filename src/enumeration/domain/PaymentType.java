package enumeration.domain;

public enum PaymentType {
        DEBIT {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.1;
            }
        }, CREDIT {
            @Override
            public double calculateDiscount(double value) {
                return value * 0.05;
            }
        };

        public abstract double calculateDiscount(double value);
            //abstract methods can't have a body
            //abstract methods MUST be overwritten
}


