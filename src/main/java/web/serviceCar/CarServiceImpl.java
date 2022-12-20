package web.serviceCar;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.modelCar.Car;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private  List<Car> countCar;
    private final CarDaoImpl daoCar;

    public CarServiceImpl(CarDaoImpl daoCar) {
        this.daoCar = daoCar;
    }

    @Override
    public List<Car> getCar(int count) {
        return daoCar.viewCars(count);
    }
}
