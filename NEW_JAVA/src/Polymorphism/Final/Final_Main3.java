/*
Scenario 2: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system
settings like database URL, username, and password. These variables cannot be modified and represent fixed
configuration values.
*/
package Polymorphism.Final;

public class Final_Main3 {
    public static void main(String[] args) {
        System.out.println("url: " + Configuration.url + ", username: " + Configuration.username + ", password: " + Configuration.password);
    }
}
