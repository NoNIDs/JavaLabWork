package chebanAD181;

public class Student implements Person {
    private String lastName;
    private String firstName;
    private int age;
    private String group;
    private int studentIDNumber;

    public Student(String lastName, String firstName, int age, String group, int studentIDNumber) {
        this.lastName =  lastName;
        this.firstName =  firstName;
        this.age =  age;
        this.group = group;
        this.studentIDNumber = studentIDNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Студент группы " + group + " " + lastName + " " + firstName + ", возраст: " + age + " " + "Номер студенческого билета " + studentIDNumber);
    }
}
