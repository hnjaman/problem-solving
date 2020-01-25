package java7;

import java.io.FileOutputStream;

public class TryWithResources {
    public static void main(String args[]) {
        // Using try-with-resources
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/User/Dropbox/Development Files/clone/HelloWorld/src/java7/abc.txt")) {
            String msg = "Welcome to javaTpoint!";
            byte byteArray[] = msg.getBytes(); //converting string into byte array
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfuly!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
