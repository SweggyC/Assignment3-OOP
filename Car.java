// Craig O'Connor
// R00202985

package assignment2;

public class Car extends Vehicle{
    protected String colour;
    protected int wheel;
    protected int engine;

    public Car(String name, String colour, int wheel, int engine) {
        super(name);
        this.wheel = wheel;
        this.engine = engine;
        this.colour = colour;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName) {
    this.name = newName;
    }
    public String getColour(){
        return this.colour;
    }
    public void setcolour(String newColour) {
        this.colour = newColour;
    }
    public void setWheel(int newWheel) {
        this.wheel = newWheel;
    }
    public int getWheel(){
        return this.wheel;
    }
    public int Engine(){
        return this.engine;
    }
    public void setEngine(int newEngine) {
        this.engine = newEngine;
    }

    public void describe(){
        System.out.println("------Cars------");
            System.out.println("");
            System.out.println(" Name: " + name +"\n Amount of wheels: "+  wheel +" \nColour of "+ name + ": " + colour +"\nEngine size: "+  engine + " Litre");
            System.out.println("");
    }


    }

