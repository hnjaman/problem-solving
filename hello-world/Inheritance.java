class Animal {
    String name = "super hnj";

    Animal() {
        System.out.println("animal constructor");
    }

    Animal(int b) {
        System.out.println("animal int cons");
    }

    void eat() {
        System.out.println("super eat animal");
    }
}

class Dog extends Animal {
    String name = "sub sujon";

    Dog() {
        System.out.println("dog constructor");
    }

    Dog(int a) {
        super(8);
        // this(4);     // compile error for recursive constructor invoke
        System.out.println("dog int cons");
    }

    void eat() {
        super.eat();
        System.out.println(this.name);  // this or without this are same result
        System.out.println(super.name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        Animal animal =  new Animal(4);
//        animal.eat();
        char c=0x000A;
        System.out.println(c);
        System.out.println("------------");
        Dog dog = new Dog(5);
        dog.eat();
    }
}
