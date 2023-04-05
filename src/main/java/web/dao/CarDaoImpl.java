package web.dao;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CarDaoImpl implements CarDao{
    public int count = 0;
    private List<Car> cars;
    public CarDaoImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car(++count, "AUDI", "black"));
        cars.add(new Car(++count, "LADA", "red"));
        cars.add(new Car(++count, "BMW", "grey"));
        cars.add(new Car(++count, "Skoda", "white"));
        cars.add(new Car(++count, "Susuki", "yellow"));
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCarCount(int count) {
        if (count==0||count>=5) {
            return cars;
        }
        List<Car> carCount = cars.subList(0,count);
        return carCount;
    }
}
