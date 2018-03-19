package home.work;

public class Employee extends Person {

    private double daySalary;
    public final double OVERTIME_COEFF = 1.5;
    public final int WORKING_HOURS = 8;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super( name, age, isMan );
        this.daySalary = daySalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public double calculateOvertime(double hours) {


        if (getAge() > 18) {
            return   daySalary = ((daySalary / WORKING_HOURS) * OVERTIME_COEFF * hours) + daySalary;
        }

        return daySalary;
    }


    public void showEmployeeInfo() {
        System.out.println( "Employee's name is: " + getName() + " and is " + getAge() + " years old. " + "Employee is male: " + isMan() + ". Employee's salary is: " + daySalary );
    }
}
