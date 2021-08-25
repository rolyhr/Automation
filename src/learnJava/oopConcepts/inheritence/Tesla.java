package learnJava.oopConcepts.inheritence;

public class Tesla extends Vehicle{

    int year, numOfBattery, horsePower;

    public Tesla(int year,
                 int numOfBattery,
                 int horsePower,
                 String manufacturer,
                 String model,
                 String trim,
                 int numOfDoor,
                 int startingSpeed,
                 String engineType){
        super(manufacturer, model, trim, numOfDoor, startingSpeed, engineType);
        this.year = year;
        this.numOfBattery = numOfBattery;
        this.horsePower = horsePower;
    }

    public void startBattery(){
        System.out.println("Battery started...");
    }

    public void stopBattery(){
        System.out.println("Battery stopped...");
    }
}
