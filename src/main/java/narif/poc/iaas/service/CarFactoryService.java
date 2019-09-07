package narif.poc.iaas.service;

import narif.poc.iaas.Car;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

@ApplicationScoped
public class CarFactoryService {

    private static final Logger LOG = Logger.getLogger(CarFactoryService.class.getName());

    private List<Car> cars;

    @PostConstruct
    public void initCarFactory(){
        LOG.info("Car factory started for the day.");
        cars = new ArrayList<>();
    }

    @PreDestroy
    public void destoryFactory(){
        LOG.info("Factory done for the day");
    }

    public void createCar(String modelNumber, String name){
        cars.add(new Car(UUID.randomUUID(), modelNumber, name));
    }

    public Optional<Car> getCarForModelNumber(String modelNumber){
        return cars.stream().filter(c->c.getModelNumber().equalsIgnoreCase(modelNumber)).findFirst();
    }

    public List<Car> getCars() {
        return cars;
    }
}
