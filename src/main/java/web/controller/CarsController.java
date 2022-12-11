package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.modelCar.Car;
import web.serviceCar.serviceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private List <Car> countCar;
    private serviceCar serviceCar;

    public CarsController(List<Car> countCar, web.serviceCar.serviceCar serviceCar) {
        this.countCar = countCar;
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String printAllCars(ModelMap model) {
        countCar = serviceCar.viewCars(5);
        model.addAttribute("countCar", countCar);
        return "cars";
    }
    @GetMapping(value = "/cars?count=2")
    public String printTwoCars(ModelMap model) {
        countCar = serviceCar.viewCars(2);
        model.addAttribute("countCar", countCar);
        return "cars";
    }

    @GetMapping(value = "/cars?count=3")
    public String printThreeCars(ModelMap model) {
        countCar = serviceCar.viewCars(3);
        model.addAttribute("countCar", countCar);
        return "cars";
    }
    @GetMapping(value = "/cars?count=4")
    public String printFourCars(ModelMap model) {
        countCar = serviceCar.viewCars(4);
        model.addAttribute("countCar", countCar);
        return "cars";
    }
}

