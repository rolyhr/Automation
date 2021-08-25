package learnJava.oopConcepts.inheritence;

public class BMW extends Vehicle{

    int year, numOfCylinder, horsePower;

    public BMW(int year,
                 int numOfCylinder,
                 int horsePower,
                 String manufacturer,
                 String model,
                 String trim,
                 int numOfDoor,
                 int startingSpeed,
                 String engineType){
        super(manufacturer, model, trim, numOfDoor, startingSpeed, engineType);
        this.year = year;
        this.numOfCylinder = numOfCylinder;
        this.horsePower = horsePower;
    }

    public void startEngine(){
        System.out.println("Engine started...");
    }

    public void stopEngine(){
        System.out.println("Engine stopped...");
    }
}
