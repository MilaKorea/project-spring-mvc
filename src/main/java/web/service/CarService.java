package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarService {
    private final CarsDAO carsDAO;

    @Autowired
    public CarService(CarsDAO carsDAO){
        this.carsDAO = carsDAO;
    }

    public List<Car> getAllCars(){
        return carsDAO.getListOfCars();
    }

    public List<Car> selectCars(int count){
        return carsDAO.takeListOfCarByCount(count);
    }
}
