package builderpattern;

import builderpattern.model.CarType;
import builderpattern.model.EngineType;
import builderpattern.model.Transmission;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngineType(EngineType engineType);
    void setTransmission(Transmission transmission);
}
