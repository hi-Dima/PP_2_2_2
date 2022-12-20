package web.dao;

import org.springframework.stereotype.Repository;
import web.modelCar.Car;

import java.util.ArrayList;
import java.util.List;

@Repository("DaoCar")
public class CarDaoImpl implements CarDao {
    private final List<Car> car = List.of(new Car("Nissan", 15, "old"),
            new Car("Mercedes", 14, "old"),
            new Car("Mazda", 1, "old"),
            new Car("BMW", 3, "old"),
            new Car("VAZ", 9, "new"));

    @Override
    public List<Car> viewCars(int count){
        List <Car> cars = new ArrayList<>();

        if (count == 5) {
            return car.stream().limit(5).toList();
        }

        if (count == 4) {
            return car.stream().limit(4).toList();
        }
        if (count == 3) {
            return car.stream().limit(3).toList();
        }

        if (count == 2) {
            return car.stream().limit(2).toList();
        }

        if (count == 1) {
            return car.stream().limit(1).toList();
        }

        if (count > 5) {
            return car.stream().limit(5).toList();
        }

        return null;
    }
}
