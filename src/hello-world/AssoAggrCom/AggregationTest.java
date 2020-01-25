package AssoAggrCom;

class Driver {
    public String name;

    Driver(String name) {
        this.name = name;
    }

    public String getDriverName() {
        return this.name;
    }

}

class Car {
    String model;
    //Driver driver;  // Car Has-A Driver presents Aggregation

//    Car(Driver driver) {
//        this.driver = driver;
//    }

    public Car(String model) {  // default constructor
        this.model=model;
    }

    public String getModelName() {
        return this.model;
    }
}

public class AggregationTest {
    public static void main(String[] args) {
        Driver driver = new Driver("Karim");
        Car car = new Car("Audi");
        System.out.println(driver.getDriverName()+" is" +
                " driving your "+car.getModelName()+" right now");
    }
}

