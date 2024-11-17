import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String lName;
    private String fName;
    private int age;
    private String city;
    public Person(String fName,String lName, int age, String city) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
