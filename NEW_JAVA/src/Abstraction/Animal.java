package Abstraction;

public abstract class Animal {
    public String animal_sound;
    public String animal_eat;

    public abstract void eat();

    public abstract void sound();

    public Animal(String animal_sound, String animal_eat) {
        this.animal_sound = animal_sound;
        this.animal_eat = animal_eat;
    }

}
