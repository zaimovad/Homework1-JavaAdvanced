package home.work;

public class PersonDemo {
    public static void main(String[] args) {

        Person[] personHolder = new Person[10];

        Person personOne = new Person( "Gosho", 25, true );
        Person personTwo = new Person( "Elena", 22, false );

        Student studentOne = new Student( "Petar", 17, true, 4.5 );
        Student studentTwo = new Student( "Eva", 16, false, 5.5 );

        Employee employeeOne = new Employee( "Maria", 28, false, 40 );
        Employee employeeTwo = new Employee( "Ivan", 18, true, 35 );

        try {
            personHolder[0] = personOne;
            personHolder[1] = personTwo;
            personHolder[2] = studentOne;
            personHolder[3] = studentTwo;
            personHolder[4] = employeeOne;
            personHolder[5] = employeeTwo;

        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println( "/////////////////" );
            System.out.println( "Array limit is reached! You can add only 10 Person/Student/Employee." );
            System.out.println( "/////////////////" );
        }


        if (personHolder != null) {

            for (Person kind : personHolder) {

                if (kind instanceof Person && !(kind instanceof Student) && !(kind instanceof Employee)) {
                    kind.showPersonInfo();
                }
                if (kind instanceof Student) {
                    ((Student) kind).showStudentInfo();
                }
                if (kind instanceof Employee) {
                    ((Employee) kind).showEmployeeInfo();
                }
            }

            System.out.println( "////////////////////////" );

            for (Person type : personHolder) {
                if (type instanceof Employee) {
                    System.out.println( "Employee's day salary plus payed overtime (if any) is: " + ((Employee) type).calculateOvertime( 2 ) );
                }
            }
        } else {
            System.out.println( "The list is Empty" );
        }
    }

}
