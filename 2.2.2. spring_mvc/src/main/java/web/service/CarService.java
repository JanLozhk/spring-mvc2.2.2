package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private static final List<Car> CAR_LIST = Arrays.asList(
            new Car("Model0", 0, 100000),
            new Car("Model1", 1, 400000),
            new Car("Model2", 2, 200000),
            new Car("Model3", 3, 300000),
            new Car("Model4", 4, 500000)
    );

    public List<Car> getAllCars(Integer count) {
        return count == null || count > CAR_LIST.size() ? CAR_LIST : CAR_LIST.subList(0, count);
    }
}
