package carshop.cars;

public class Truck extends Car {
    int weight;
    public Truck(int speed, boolean isSellOut, double regularPrice, String color,int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight = weight;
    }
    public double getSalePrice() { // если вес больше 2000, скидка 10%
        if(weight > 2000)
            return super.getSalePrice() - super.getSalePrice()*0.1;
        return super.getSalePrice();
    }
}
