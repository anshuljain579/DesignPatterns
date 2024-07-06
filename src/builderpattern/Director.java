package builderpattern;

import builderpattern.model.CarType;
import builderpattern.model.EngineType;
import builderpattern.model.Transmission;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(2);
        builder.setEngineType(EngineType.DIESEL);
        builder.setTransmission(Transmission.MANUAL);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngineType(EngineType.PETROL);
        builder.setTransmission(Transmission.AUTOMATIC);
    }
}
