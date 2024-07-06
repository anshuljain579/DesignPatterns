package builderpattern.model;

import java.util.Objects;

public class Car {
    private final CarType carType;
    private final int seats;
    private final EngineType engineType;
    private final Transmission transmission;

    public Car(CarType carType, int seats, EngineType engineType, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engineType = engineType;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats && carType == car.carType && engineType == car.engineType && transmission == car.transmission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType, seats, engineType, transmission);
    }

    @Override
    public String toString() {
        return STR."Car{carType=\{carType}, seats=\{seats}, engineType=\{engineType}, transmission=\{transmission}\{'}'}";
    }
}
