package chebanAD181;

public class Lecturer implements Person {
    private String lastName;
    private String firstName;
    private int age;
    private String department;
    private double salary;

    public Lecturer(String lastName, String firstName, int age, String department, double salary) {
        this.lastName =  lastName;
        this.firstName =  firstName;
        this.age =  age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Преподаватель кафедры " + department + " " + lastName + " " + firstName + ", возраст: " + age                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  + ". Зарплата: " + salary);
    }
}
