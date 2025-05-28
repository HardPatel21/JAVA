package Abstraction;

public class Cat extends Animal{
    public String cat_sound;
    public String cat_eat;

    public Cat(String animal_sound, String animal_eat, String cat_sound, String cat_eat) {
        super(animal_sound, animal_eat);
        this.cat_sound = cat_sound;
        this.cat_eat = cat_eat;
    }

    @Override
    public void sound() {
        System.out.println("cat_sound: " + cat_sound);
    }

    @Override
    public void eat() {
        System.out.println("cat_eat: " + cat_eat);
    }
}
