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

        if (count > 0) {
            if (count == 5) {
                countCar = daoCar.viewCars(5);
            }
            if (count == 4) {
                countCar = daoCar.viewCars(4);
            }
            if (count == 3) {
                countCar = daoCar.viewCars(3);
            }
            if (count == 2) {
                countCar = daoCar.viewCars(2);
            }
            if (count == 1) {
                countCar = daoCar.viewCars(1);
            }
            if (count > 5) {
                countCar = daoCar.viewCars(5);
            }
        } else {
            countCar = null;
        }
        return countCar;
    }
}
