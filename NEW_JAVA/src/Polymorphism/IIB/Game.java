package Polymorphism.IIB;

public class Game {
    public String environment;
    public boolean resourcesLoaded;
    public boolean initialized;

    {
        System.out.println("Setting up game environment...");
        environment = "Fantasy World";

        System.out.println("Loading game resources...");
        resourcesLoaded = true;

        System.out.println("Performing additional initialization...");
        initialized = true;
    }

    public Game() {
        System.out.println("Game constructor called.");
    }

    public void showGameStatus() {
        System.out.println("Game Status:");
        System.out.println("Environment: " + environment);
        System.out.println("Resources Loaded: " + resourcesLoaded);
        System.out.println("Initialized: " + initialized);
    }
}
