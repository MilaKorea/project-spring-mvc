package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarService implements CarServiceInterface{
    private final CarsDAO carsDAO;

    @Autowired
    public CarService(CarsDAO carsDAO){
        this.carsDAO = carsDAO;
    }
    @Override
    public List<Car> getListOfCars(){
        return carsDAO.getListOfCars();
    }
    @Override
    public List<Car> takeListOfCarByCount(int count){
        return carsDAO.takeListOfCarByCount(count);
    }
}
