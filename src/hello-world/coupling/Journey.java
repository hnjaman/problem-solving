/*
    http://adnjavainterview.blogspot.com/2015/10/difference-between-loose-coupling-and.html

    In the above example, Journey and Car objects are loosely coupled.
    It means Vehicle is an interface and we can inject any of the implemented
    classes at run time and we can provide service to the end user.

    The examples of Loose coupling are Interface, JMS,
    Spring IOC(Dependency Injection, it can reduce the tight coupling).

 */

package coupling;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Travel by Car");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Travel by Bike");
    }
}

// create main class Journey
public class Journey {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}

