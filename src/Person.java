public class Person {
    private int age;
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int age, String firstName, String lastName) {
        this(firstName, lastName);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printData() {
        System.out.println("First: " + firstName + " Last: " + lastName + " age: " + age);
    }
}
