package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 3));
        cars.add(new Car(2, "Audi", 7));
        cars.add(new Car(3, "Mercedes", 5));
        cars.add(new Car(4, "Volkswagen", 2));
        cars.add(new Car(5, "Toyota", 6));
    }

    public List<Car> getCars(int count) {
        return (count >= cars.size() || count <= 0) ? cars : cars.subList(0, count);
    }
}
