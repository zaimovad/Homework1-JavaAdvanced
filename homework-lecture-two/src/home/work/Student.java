package home.work;

public class Student extends Person {

    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        super( name, age, isMan );
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void showStudentInfo() {
        System.out.println( "Student's name is: " + getName() + " and is " + getAge() + " years old. " + "Student is male: " + isMan() + ". Student's score is: " + score );
    }
}
