package builderpattern;
import builderpattern.model.Car;

public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSUV(carBuilder);
        Car car = carBuilder.getCar();
        System.out.println(STR."SUC Car  >> \{car}");


        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.getCar();
        System.out.println(STR."Sports Car >> \{sportsCar}");
    }
}
