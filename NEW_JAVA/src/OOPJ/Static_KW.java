package OOPJ;

class Student_1 {
    int rollNo;
    String name;
    static String collegeName;

    static {
        // static block: initialize all the static items here
        System.out.println("--- static block called ---");
        collegeName = "Govt. Engineering College";
    }

    public Student_1(int rollNo, String name) {
        System.out.println("--- constructor called ---");
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }
}

public class Static_KW {
    public static void main(String[] args) {
        Student_1 s = new Student_1(420, "mohaklal");
        //        System.out.println(s);
        System.out.println("College Name: " + Student_1.collegeName);

    }
}

