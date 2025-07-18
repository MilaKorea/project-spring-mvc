package web.dao;

import org.w3c.dom.stylesheets.LinkStyle;
import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> getListOfCars();
    List<Car> takeListOfCarByCount(int count);

}
