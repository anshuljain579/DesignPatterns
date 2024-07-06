package builderpattern;
import builderpattern.model.Car;

public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSUV(carBuilder);
        Car car = carBuilder.getCar();
        System.out.println(car);
    }
}
