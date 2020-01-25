package lambda;

//interface Drawable1{
//    public void draw();
//}
public class LambdaExpressionExample implements iDrawable{
    public static void main(String[] args) {
        int width=10;
        //without lambda, Drawable implementation using anonymous class
        iDrawable d=new iDrawable(){
            public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();
    }

    @Override
    public void draw() {
       // System.out.println("override");
    }
}
