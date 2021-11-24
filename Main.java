// Craig O'Connor
// R00202985

import assignment2.Car;
import assignment2.bicycle;

public class Main {
 
public static void main(String[] args){
    Car car1 = new Car("Mazda", "Red", 4, 3);
    System.out.println();
    car1.describe();
    bicycle bike1 = new bicycle("classic", "Black", 2);
    bike1.describe();
}
}
