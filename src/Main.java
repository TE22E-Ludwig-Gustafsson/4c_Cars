public class Main {
    public static void main(String[] args) {
        System.out.println("Working with Cars");

        //Datatype , variableName = Create the object
        //  Car          car1     = new Car();

        //create a car
        Car car1 = new Car();

        //Give the attributes values
        Car car1 = new Car("Blue", 200, "Hudson");

        //create a second car
        Car car2 = new Car("Brown",  100, "Mater");

        System.out.println(car1.name + " is " + car1.color + " and has max Speed of " + car1.maxSpeed);
        System.out.println(car2.name + " is " + car2.color + " and has max Speed of " + car2.maxSpeed);
}