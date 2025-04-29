class Student {
    private int roll_no;
    private double marks;

    public Student(int roll_no, double marks) {
        this.marks = marks;
        this.roll_no = roll_no;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
};

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student(34, 85.55);

        System.out.println(s1.getMarks());
        System.out.println(s1.getRoll_no());

        s1.setMarks(90.90);
        s1.setRoll_no(44);

        System.out.println("New Marks: " + s1.getMarks());
        System.out.println("New Roll_no: " + s1.getRoll_no());

        System.out.println(s1);
        System.out.println(s1.hashCode());
    }
}
