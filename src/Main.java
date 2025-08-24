import Chapter2.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.Builder().make("Honda").model("Civic").build();
        car.getMake();
        car.getModel();
    }
}