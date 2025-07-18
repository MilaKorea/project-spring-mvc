package web.service;

import web.models.Car;

import java.util.List;

public interface CarServiceInterface {
    List<Car> getListOfCars();
    List<Car> takeListOfCarByCount(int count);
}
