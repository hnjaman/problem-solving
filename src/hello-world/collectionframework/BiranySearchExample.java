package collectionframework;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class BiranySearchExample {
    public static void main(String[] args) {
        List<Person> persons = new Vector<>();
        persons.add(new Person("b"));
        persons.add(new Person("d"));
        persons.add(new Person("a"));
        //persons.add(new Person("b"));

        Collections.sort(persons);
        Person key = new Person("c");

        int index = Collections.binarySearch(persons,key);
        System.out.println(index);
        if(index > 0){
            System.out.println("Found");
        }else{
            System.out.println("not found");
        }
    }
}
