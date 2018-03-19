package home.work;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.isMan = isMan;
        this.name = name;
        if (age > 0 && age <= 110) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void showPersonInfo() {
        System.out.println( "Person's name is: " + name + " and is " + age + " years old. " + "Person is male: " + isMan );
    }
}
