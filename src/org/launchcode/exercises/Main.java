package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        int integer1 = 7;
//        int integer2 = 0;
//        int divideResult = Divide(integer1, integer2);
//        System.out.println(divideResult);
        try {
            Divide(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }



//        HashMap<String, String> studentFiles = new HashMap<>();
//        studentFiles.put("Carl", "Program.java");
//        studentFiles.put("Brad", "");
//        studentFiles.put("Elizabeth", "MyCode.java");
//        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) throws ArithmeticException
    {
        // Your function should return the result of x/y.
        //
        // However, if y is zero, you should throw an exception.
        // Try to use an ArithmeticException and put your try/catch block in Divide()
        // to test out your error-handling skills. If an exception is caught,
        // make sure to print out a helpful message.

//        int output = 0;
//
//        try {
//            output = x / y;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

        return x /y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        // Returning 0 just to stop this missing return statement error
        // we were getting initially
        return 0;
    }

}
