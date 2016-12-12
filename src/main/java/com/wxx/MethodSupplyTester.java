package com.wxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wstar
 * @version: 1.0 version
 * @description:
 * @create time: 16-12-12 下午2:33
 */
public class MethodSupplyTester {

    public static void main(String[] args) {

        Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::collide);
        cars.forEach(Car::repair);

        Car police = Car.create(Car::new);
        cars.forEach(police::follow);

        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }

}
