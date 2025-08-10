package day_7_assignment.wrapper_class;

//5.	Convert null to wrapper classes

public class NullToWrapperDemo {
    public static void main(String[] args) {
        
       
        Integer intObj = null;
        Double doubleObj = null;
        Boolean boolObj = null;

        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);

        // Trying to unbox null wrapper -> NullPointerException
        try {
            int num = intObj; // auto-unboxing
            System.out.println("Primitive int: " + num);
        } catch (NullPointerException e) {
            System.out.println("Cannot unbox null Integer: " + e);
        }

        try {
            boolean flag = boolObj; // auto-unboxing
            System.out.println("Primitive boolean: " + flag);
        } catch (NullPointerException e) {
            System.out.println("Cannot unbox null Boolean: " + e);
        }
    }
}
