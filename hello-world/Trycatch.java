import java.io.*;

public class Trycatch implements Serializable{
    public static void main(String[] args) throws IOException {
        FileOutputStream fileStream = new FileOutputStream("Try.txt");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(new Trycatch());
        objectStream.close();
//        try{
//            System.out.println("try");
//        }
////        catch (Exception ex){
////            System.out.println("catch");
////        }
//        finally {
//           // int sum=5/0;
//            System.out.println("finally");
//        }
    }
}
