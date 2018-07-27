package hackjava;

public class JavaSingletonPattern {
    private static JavaSingletonPattern singleton;
    public static String str;
    private JavaSingletonPattern() {
    }
    public static JavaSingletonPattern getSingleInstance() {
//        if (singleton == null) {      //## thread safe part
//            synchronized (JavaSingletonPattern.class) {
//                if (singleton == null) {
//                    singleton = new JavaSingletonPattern();
//                }
//            }
//        }

        if (singleton == null) {        //## Not thread safe
            singleton = new JavaSingletonPattern();
        }

        return singleton;
    }
}
