package facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);

        System.out.println("--- SUCCESSFUL SCENARIO ---");
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie("Inception");

        System.out.println("\n--- ERROR HANDLING SCENARIO ---");
        homeTheater.watchMovie("");
    }
}