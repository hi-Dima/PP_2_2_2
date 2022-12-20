package web.dao;

import web.modelCar.Car;

import java.util.List;

public interface CarDao {
    List<Car> viewCars(int count);
}
