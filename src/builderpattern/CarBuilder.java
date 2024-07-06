package builderpattern;

import builderpattern.model.Car;
import builderpattern.model.CarType;
import builderpattern.model.EngineType;
import builderpattern.model.Transmission;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private EngineType engineType;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getCar() {
        return new Car(carType, seats, engineType, transmission);
    }
}
