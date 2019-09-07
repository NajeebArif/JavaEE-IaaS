package narif.poc.iaas;

import java.util.UUID;

public class Car {

    private UUID carId;
    private String modelNumber;
    private String name;

    public Car() {
    }

    public Car(UUID carId, String modelNumber, String name) {
        this.carId = carId;
        this.modelNumber = modelNumber;
        this.name = name;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
