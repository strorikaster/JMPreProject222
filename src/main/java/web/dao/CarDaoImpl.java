package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", 5 , "black"));
        cars.add(new Car("Porshe", 8, "red"));
        cars.add(new Car("Ferarri", 10, "ornange"));
        cars.add(new Car("Mercedes", 6, "white"));
        cars.add(new Car("SKODA", 3, "gold"));
    }

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        if(count > 5 || count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}