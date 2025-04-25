import java.time.LocalDate;
import java.time.LocalTime;

public class FirstProgram {
    public static void main(String args[]) {
        System.out.println("Hello World!\n");

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

    }
}
/*
 * To compile the java program: javac FirstProgram.java
 * To run the java program: java FirstProgram
 * 
 */