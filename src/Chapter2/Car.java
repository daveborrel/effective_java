package Chapter2;

public class Car {
    private final String make;
    private final String model;

    // In order for build to return properly
    //    Car(String make, String model) {
    //        this.make = make;
    //        this.model = model;
    //    }

    Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
    }

    public String getMake() {
        System.out.println(make);
        return make;
    }
    public String getModel() {
        System.out.println(model);
        return model;
    }

    public static class Builder {
        private String make;
        private String model;

        public Builder make(String make) {
            this.make = make;
            return this;
        };

        public Builder model(String model) {
            this.model = model;
            return this;
        };

        public Car build() {
            return new Car(this);
        }
    }
}
