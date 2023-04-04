package web.dao;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CarDaoImpl {
    public static int COUNT = 0;
    private List<Car> cars;
    public CarDaoImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car(++COUNT, "AUDI", "black"));
        cars.add(new Car(++COUNT, "LADA", "red"));
        cars.add(new Car(++COUNT, "BMW", "grey"));
        cars.add(new Car(++COUNT, "Skoda", "white"));
        cars.add(new Car(++COUNT, "Susuki", "yellow"));
    }

    public List<Car> getCarCount(int count) {
        if (count==0||count>=5) {
            return cars;
        }
        List<Car> carCount = cars.subList(0,count);
        return carCount;
    }
}
