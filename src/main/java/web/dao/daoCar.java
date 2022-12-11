package web.dao;

import org.springframework.stereotype.Repository;
import web.modelCar.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class daoCar {
    public List<Car> listOf5Cars() {
        List<Car> cars = Arrays.asList(new Car("Nissan", 15, "old"),
                new Car("Mercedes", 14, "old"),
                new Car("Mazda", 1, "old"),
                new Car("BMW", 3, "old"),
                new Car("VAZ", 9, "new"));
        return cars;
    }
}
