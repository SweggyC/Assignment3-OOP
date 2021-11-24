// Craig O'Connor
// R00202985

package assignment2;

public class bicycle extends Vehicle{
    protected String colour;
    int wheel;
   

    public bicycle(String name, String colour, int wheel) {
        super(name);
        this.wheel = wheel;
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

        public void describe(){
            System.out.println("------Bikes------");
            System.out.println("");
            System.out.println(" Name: " + name +"\n Amount of wheels: "+  wheel +" \nColour of "+ name + ": " + colour);
        }

    
    }
