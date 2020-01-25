class Shape {
    //int area=50;
//    float area(int a){
//        System.out.println("Area of the circle");
//        return (float) (3.1416*a*a);
//    }
//
//    float area(float a){
//        System.out.println("Area of the circle");
//        return (float) (3.1416*a*a);
//    }
//
//    float area(int a, int b){
//        System.out.println("Area of the rectangle");
//        return a*b;
//    }

//    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape.area(5));      // for circle
//        System.out.println(shape.area(5,6)); // for rectangle
//    }

    void draw(){
        System.out.println("drawing...");
    }
}
class Circle extends Shape{
    //int area = 70;
    void draw(){
        System.out.println("drawing circle...");
    }

}

class Rectangle extends Shape{
   // int area = 30;
    void draw(){
        System.out.println("drawing rectangle...");
    }
}
