package web.serviceCar;

import web.modelCar.Car;

import java.util.List;

public interface serviceCarImpl {
    public List<Car> getOneCar();
    public List<Car> getTwoCar();
    public List<Car> getThreeCar();
    public List<Car> getFourCar();
    public List<Car> getAllCar();
}
