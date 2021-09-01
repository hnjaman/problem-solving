import java.util.Scanner;
import java.util.Set;

public class TreeSet {
    public static void main(String args[]){

        Set<Person> persons = new java.util.TreeSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        persons.add(new Person(sc.next()));
        persons.add(new Person(sc.next()));
        persons.add(new Person(sc.next()));

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
