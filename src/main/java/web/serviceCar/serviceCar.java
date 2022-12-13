package web.serviceCar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.daoCar;
import web.modelCar.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class serviceCar implements serviceCarImpl {

    private final daoCar daoCar;
    public serviceCar(daoCar daoCar) {
        this.daoCar = daoCar;
    }


    @Override
    public List<Car> getOneCar() {
        return daoCar.viewCars(1) ;
    }

    @Override
    public List<Car> getTwoCar() {
        return daoCar.viewCars(2);
    }

    @Override
    public List<Car> getThreeCar() {
        return daoCar.viewCars(3);
    }

    @Override
    public List<Car> getFourCar() {
        return daoCar.viewCars(4);
    }

    @Override
    public List<Car> getAllCar() {
        return daoCar.viewCars(5);
    }
}
