import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        Male,Female
    }

    String name;
    int age;
    String emailAddress;
    Sex gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public Person() {

    }

    public Person(String name, int age, String emailAddress, Sex gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void printPerson(){
        System.out.println(this.toString());
    }

    public static List<Person> generateDefaultList(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Atanu",20, "atanu484@gmail.com" , Sex.Male ));
        people.add(new Person("Ayan",21, "ayan1322@gmail.com" , Sex.Male ));
        people.add(new Person("Shubho",23, "shubho34325@gmail.com" , Sex.Male ));

        return people;
    }
}
