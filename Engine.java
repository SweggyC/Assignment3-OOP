// Craig O'Connor
// R00202985

package assignment2;
public class Engine {
    private int size;
    private String brand;

public Engine(int size, String brand){
this.size = size;
this.brand = brand;
}
public void setSize(int newSize) {
    this.size = newSize;
}
public void setBrand(String newBrand) {
    this.brand = newBrand;
}
public int getSize(){
    return this.size;
}
public String getBrand(){
    return this.brand;
}



}
