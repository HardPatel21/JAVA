/*
Scenario 1: Animal Hierarchy
Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that
provide specific implementations for these abstract methods.
*/
package Abstraction;

public class Abstraction_T1 {
    public static void main(String[] args) {
      new Animal("a","b") {
          @Override
          public void eat() {
              System.out.println("hii there");
          }

          @Override
          public void sound() {
              System.out.println("hello");
          }
      }.sound();
    }
}
