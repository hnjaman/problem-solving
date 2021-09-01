/*
*
* 1. Yes. use non-primitive return types which return reference not value.
* 2. No. you can declare any modifier you need in super method
* but you have to declare less strict modifier in child method compare to super.
* follow the sequence private>default>protected>public.
* 3. No. actualy you can declare static super method in child class with different
* implemention which seems you method overriding. but its not. static method
* is not the property of object rather class.
* i will modify this article on above cases with example. thanks.
* */


class Bank{
    public static int getRateOfInterest(){return 0;}
    public static void display() {
        System.out.println("bank");
    }
}

class SBI extends Bank{
    public static int getRateOfInterest(){return 8;}
    public static void display() {
        System.out.println("sbi");
    }
}

class ICICI extends Bank{
    public static int getRateOfInterest(){return 7;}
    public static void display() {
        System.out.println("icici");
    }
}
class AXIS extends Bank{
    public static int getRateOfInterest(){return 9;}
    public static void display() {
        System.out.println("axis");
    }
}

class Overriding{

    public static void main(String args[]){
        Bank bank = new SBI();
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        bank.display();
        s.display();
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
