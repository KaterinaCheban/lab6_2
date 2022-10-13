package carshop.cars;
public abstract class Car {
    int speed;
    boolean isSellOut;
    double regularPrice;
    String color;
    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public boolean isSellOut() {
        return isSellOut;
    }


    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
