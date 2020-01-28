package chebanAD181;

public class Main {

    public static void main(String[] args) {
	    Person student = new Student("Fault", "Human", 18, "AD-181", 23);
	    Person lecturer =  new Lecturer("Richard", "Guddini", 40, "126", 10000);
        Person []arr = new Person[]{student,lecturer};
        for (Person value:arr) {
            value.printInfo();
        }
    }
}
