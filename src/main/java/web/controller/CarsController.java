package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;



@Controller
public class CarsController {

    @Autowired
    private CarService carsService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") String count, ModelMap model) {
        model.addAttribute("cars", carsService.returnQtyOfCar(Integer.parseInt(count)));
        return "cars";
    }
}
