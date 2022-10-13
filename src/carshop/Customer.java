package carshop;

public interface Customer {
    double getCarsPrice();

    String getCarColors();

    int getCarPrice(int id);

    String getCarColor(int id);

    boolean purchaseCar(int id);
}
