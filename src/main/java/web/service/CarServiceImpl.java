package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl {
    CarDaoImpl carDao = new CarDaoImpl();
    public List<Car> getCarCount(int count) {
       return carDao.getCarCount(count);
    }
}
