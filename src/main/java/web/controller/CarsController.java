package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.modelCar.Car;
import web.serviceCar.serviceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private List<Car> countCar;
    private final serviceCar serviceCar;

    public CarsController(serviceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String printAllCars(ModelMap model,
                               @RequestParam("count") int count) {
        if (count > 0) {
            if (count == 5) {
                countCar = serviceCar.getAllCar();
            }
            if (count == 4) {
                countCar = serviceCar.getFourCar();
            }
            if (count == 3) {
                countCar = serviceCar.getThreeCar();
            }
            if (count == 2) {
                countCar = serviceCar.getTwoCar();
            }
            if (count == 1) {
                countCar = serviceCar.getOneCar();
            }
            if (count > 5) {
                countCar = serviceCar.getAllCar();
            }
        } else {
            countCar = null;
        }
        model.addAttribute("countCar", countCar);
        return "cars";
    }
}

