public class App {
    public static void main(String[] args){
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020, 50.0);
        Vehicle car2 = new Vehicle("Honda", "Civic", 2019, 5.0);
        System.out.println(car1);
        System.out.println(car2);
        car1.drive();
        car2.drive();
        car2.refuel(20.0);
        car2.drive();
        System.out.println(car1);
        System.out.println(car2);


    }
}
