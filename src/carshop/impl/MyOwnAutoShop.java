package carshop.impl;
import carshop.cars.Car;
import carshop.Admin;
import carshop.Customer;
import java.util.Arrays;
public class MyOwnAutoShop implements Admin, Customer {
    public MyOwnAutoShop(Car[] cars) {
        this.cars = cars;
    }
    Car[] cars;
    public double getIncome() {
        double sum = 0;

        for(Car car : cars){
            if(car.isSellOut())
                sum+=car.getSalePrice();
        }
        return sum;
    }
    public double getCarsPrice() {
        double sum = 0;
        for(Car car : cars){
            sum+= car.getRegularPrice();
        }
        return sum;
    }
    public String getCarColors() {
        String[] string = new String[cars.length];
        int i = 0;
        for(Car car : cars){
            string[i] = car.getColor();
            i++;
        }
        return Arrays.toString(string);
    }
    public int getCarPrice(int id) {
        return (int) cars[id].getSalePrice();
    }
    public String getCarColor(int id) {
        return cars[id].getColor();
    }
    public boolean purchaseCar(int id) {
        return cars[id].isSellOut();
    }
}