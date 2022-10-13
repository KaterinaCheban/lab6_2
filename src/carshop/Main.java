package carshop;
import carshop.cars.Car;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.impl.MyOwnAutoShop;
public class Main {
    public static void main(String[] args) {
        Sedan sedan_1 = new Sedan(200,true,500000,"Чорний",250);
        Sedan sedan_2 = new Sedan(200,true,400000,"Білий",200);
        Ford ford_1 = new Ford(210,true,350000,"Червоний",2005,10000);
        Ford ford_2 = new Ford(250,false,800000,"Коричневий",2021,10000);
        Truck truck_1 = new Truck(180,false,550000,"Синій",2500);
        Truck truck_2 = new Truck(150,true,400000,"Сірий",1500);
        MyOwnAutoShop myOwnAutoShop = new MyOwnAutoShop(new Car[]{sedan_1, sedan_2, ford_1, ford_2, truck_1, truck_2});
        System.out.println(myOwnAutoShop.getIncome());
        System.out.println("id: " + myOwnAutoShop.getCarColor(1));
        System.out.println(myOwnAutoShop.getCarsPrice());
        System.out.println(myOwnAutoShop.getCarColors());
        System.out.println("Ціна: " + myOwnAutoShop.getCarPrice(3));
        System.out.println();
        System.out.println("Седан №1: " + sedan_1.getColor() + " " + sedan_1.getSalePrice());
        System.out.println("Седан №2: " + sedan_2.getColor() + " " + sedan_2.getSalePrice());
        System.out.println("Форд №1: " + ford_1.getColor() + " " + ford_1.getSalePrice());
        System.out.println("Форд №2: " + ford_2.getColor() + " " + ford_2.getSalePrice());
        System.out.println("Трек №1: " + truck_1.getColor() + " " + truck_1.getSalePrice());
        System.out.println("Трек №2: " + truck_2.getColor() + " " + truck_2.getSalePrice());
        System.out.println();
        System.out.println("Сумарна ціна проданих авто: " + myOwnAutoShop.getIncome());
        System.out.println(myOwnAutoShop.getCarsPrice());
        System.out.println(myOwnAutoShop.getCarPrice(3));
    }
}