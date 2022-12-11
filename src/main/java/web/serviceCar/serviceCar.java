package web.serviceCar;

import org.springframework.stereotype.Service;
import web.dao.daoCar;
import web.modelCar.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class serviceCar {
    private daoCar car;

    public serviceCar(daoCar car) {
        this.car = car;
    }

    public List<Car> viewCars(int count){
        List<Car> car = new ArrayList<>();
        if (count == 5) {
            car = new daoCar().listOf5Cars();
            return car;
        }
        if (count == 4) {
            for (int i = 0; i < 4; i++) {
                car.add(new daoCar().listOf5Cars().get(i));
            }
            return car;
        }
        if (count == 3) {
            for (int i = 0; i < 3; i++) {
                car.add(new daoCar().listOf5Cars().get(i));
            }
            return car;
        }
        if (count == 2) {
            for (int i = 0; i < 2; i++) {
                car.add(new daoCar().listOf5Cars().get(i));
            }
            return  car;
        }
        if (count == 1) {
            car.add(new daoCar().listOf5Cars().get(0));
            return  car;
        }
        if (count > 5) {
            car = new daoCar().listOf5Cars();
            return  car;
        }
        return null;
    }
}
