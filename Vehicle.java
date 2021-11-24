// Craig O'Connor
// R00202985

package assignment2;
public class Vehicle{
    protected String name;
    protected double fuel;

public Vehicle(String name){
this.name = name;

}

public void setFuel(double newFuel) {
    this.fuel = newFuel;
}

public double getFuel(){
    return this.fuel;
}

public void describe(){
    System.out.println(name + fuel);
}

}

