public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double fuel;
    private boolean operational;

public Vehicle(String make, String model, int year, double fuel){
    this.make = make;
    this.model = model;
    this.year = year;
    this.fuel = fuel;
    if(fuel > 0){
        this.operational=true;
    } else {
        this.operational=false;
    }
}
public boolean drive(){
if(fuel > 10){
    fuel = fuel - 10;
    return true;
} else {
    return false;
}
}
public void refuel(double amount){
fuel = fuel + amount;
}
public String toString(){
    return ("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel: " + fuel);
}

}



