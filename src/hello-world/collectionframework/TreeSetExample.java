package collectionframework;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("r"));
        persons.add(new Person("b"));
        persons.add(new Person("d"));
        persons.add(new Person("a"));
        //Collections.sort(persons);

        for(Person p : persons){
            System.out.println(p);
        }
    }
}
