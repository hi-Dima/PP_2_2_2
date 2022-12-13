package web.dao;

import org.springframework.stereotype.Repository;
import web.modelCar.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("DaoCar")
public class daoCar implements daoCarImp {

    @Override
    public List<Car> viewCars(int count){
        List<Car> car = new ArrayList<>();
        if (count == 5) {
            car.clear();
            car = listOf5Cars();
            return car;
        }
        if (count == 4) {
            car.clear();
            for (int i = 0; i < 4; i++) {
                car.add(listOf5Cars().get(i));
            }
            return car;
        }
        if (count == 3) {
            car.clear();
            for (int i = 0; i < 3; i++) {
                car.add(listOf5Cars().get(i));
            }
            return car;
        }
        if (count == 2) {
            car.clear();
            for (int i = 0; i < 2; i++) {
                car.add(listOf5Cars().get(i));
            }
            return  car;
        }
        if (count == 1) {
            car.clear();
            car.add(listOf5Cars().get(0));
            return  car;
        }
        if (count > 5) {
            car.clear();
            car = listOf5Cars();
            return  car;
        }
        return null;
    }
    public List<Car> listOf5Cars() {
        return Arrays.asList(new Car("Nissan", 15, "old"),
                new Car("Mercedes", 14, "old"),
                new Car("Mazda", 1, "old"),
                new Car("BMW", 3, "old"),
                new Car("VAZ", 9, "new"));
    }

}
