package learnJava.oopConcepts.inheritence;

public class MainDriver {

    public static void main(String[] args) {
        BMW accord = new BMW(
                2021,
                4,
                191,
                "Honda",
                "Accord",
                "EX-L",
                4,
                5,
                "Internal Combustion"
        );

        Tesla modelS = new Tesla(
                2021,
                3,
                350,
                "Tesla",
                "Model S",
                "90S",
                4,
                5,
                "Electric"
        );

        System.out.println("Brand: " + accord.manufacturer);
        System.out.println("Model: " + accord.model);
        System.out.println("Trim: " + accord.trim);
        System.out.println("Engine Type: " + accord.engineType);
        accord.startEngine();
        accord.stopEngine();
        accord.playMusic();

        System.out.println("********************************");
        System.out.println("Current speed: " + accord.startingSpeed);
        accord.speedUp(25);
        System.out.println("New speed after speeding up: " + accord.startingSpeed);

        System.out.println("********************************");
        System.out.println("Current speed: " + accord.startingSpeed);
        accord.applyBrake(5);
        System.out.println("New speed after braking: " + accord.startingSpeed);

        System.out.println("********************************");
        System.out.println("Brand: " + modelS.manufacturer);
        System.out.println("Model: " + modelS.model);
        System.out.println("Trim: " + modelS.trim);
        System.out.println("Engine Type: " + modelS.engineType);
        modelS.startBattery();
        modelS.stopBattery();

    }
}
