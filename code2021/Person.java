package code2021;

/**
 * Created by Lenovo on 12/30/2021.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person;
        person = new Person("hnj");
        System.out.println(person.name);

        changeName(person);

        System.out.println(person.name);
    }

    public static void changeName(Person copyOfPerson){
        copyOfPerson.setName("jaman");
    }
}
