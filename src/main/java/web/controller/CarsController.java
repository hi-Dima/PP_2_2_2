package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.modelCar.Car;
import web.serviceCar.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    private List<Car> countCar;
    private final CarServiceImpl serviceCar;

    public CarsController(CarServiceImpl serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String printAllCars(ModelMap model,
                               @RequestParam("count") int count) {
        model.addAttribute("countCar",serviceCar.getCar(count));
        return "cars";
    }
}

