package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO implements CarDao{
    private List<Car> listOfCars;
    {
        listOfCars = new ArrayList<>();
        listOfCars.add(new Car("Falcon X1", "Electric Motor", 2022));
        listOfCars.add(new Car("Titan Cruiser", "V8 Gasoline Engine", 2018));
        listOfCars.add(new Car("Aurora Swift", "Hybrid(Gasoline + Electric)", 2020));
        listOfCars.add(new Car("Stormrunner V-Twin", "V2 Diesel Engine", 2015));
        listOfCars.add(new Car("Nebula Aero", "Hydrogen Fuel Cell", 2023));
    }
    @Override
    public List<Car> getListOfCars() {
        return listOfCars;
    }
    @Override
    public List<Car> takeListOfCarByCount(int count){
        if(count>=listOfCars.size()){
            return listOfCars;
        }else{
            return new ArrayList<>(listOfCars.subList(0,count));
        }
    }
}
