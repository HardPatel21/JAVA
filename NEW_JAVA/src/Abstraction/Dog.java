package Abstraction;

public class Dog extends Animal{
    public String dog_sound;
    public String dog_eat;

    public Dog(String animal_sound, String animal_eat, String dog_sound, String dog_eat) {
        super(animal_sound, animal_eat);
        this.dog_sound = dog_sound;
        this.dog_eat = dog_eat;
    }

    @Override
    public void eat() {
        System.out.println("dog_eat: " + dog_eat);
    }

    @Override
    public void sound() {
        System.out.println("dog_sound: " + dog_sound);
    }

}
