package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService){
        this.carService = carService;
    }

      @GetMapping()
    public String showCarsByCount(@RequestParam(value = "count", required = false) Integer count, Model model){
        List<Car> result;
        if(count == null || count == 0 || count >= carService.getListOfCars().size()){
            result = carService.getListOfCars();
            model.addAttribute("title", "Full List of Cars");
        }else {
            result = carService.takeListOfCarByCount(count);
            model.addAttribute("title", "Cars by Count: " + count);
        }
            model.addAttribute("cars", result);
            return "cars";
    }
}
