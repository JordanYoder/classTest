public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Bill", "Hochstetler");
        Person person2 = new Person(80, "Phil", "Yoder");
        person1.setAge(88);

        person1.printData();
        person2.printData();
    }
}
