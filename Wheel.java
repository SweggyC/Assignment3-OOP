// Craig O'Connor
// R00202985

package assignment2;

public class Wheel {
    private String brand;
    private int size;  

public Wheel(String brand, int size){
    this.brand = brand;
    this.size = size;
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
