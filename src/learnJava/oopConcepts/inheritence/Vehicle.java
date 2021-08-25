package learnJava.oopConcepts.inheritence;

public class Vehicle {

    String manufacturer, model, trim, engineType;
    int numOfDoor, startingSpeed;

    public Vehicle(String manufacturer,
                   String model,
                   String trim,
                   int numOfDoor,
                   int startingSpeed,
                   String engineType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.trim = trim;
        this.numOfDoor = numOfDoor;
        this.startingSpeed = startingSpeed;
        this.engineType = engineType;
    }

    public void speedUp(int increaseMPH){
        startingSpeed += increaseMPH;
    }

    public void applyBrake(int decreaseMPH){
        startingSpeed -= decreaseMPH;
    }

    public void honk(){
        System.out.println("Honking...");
    }

    public void playMusic(){
        System.out.println("Playing music...");
    }
}
