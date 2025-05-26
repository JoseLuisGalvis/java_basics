package com.java.basics;

public class Variables {
    public static void main(String[] args) {
        String name = "Juan Jose"; // String Variable
        System.out.println(name);
        int Num = 15; // Integer Variable
        System.out.println(Num);
        // variable without value
        int myNum;
        // variable with value later
        myNum = 18;
        System.out.println(myNum);
        // Overwrite an existing variable value
        int Number = 15;
        Number = 20;  // Number is now 20
        System.out.println(Number);
        // Final Variable
        final int n = 19;
        System.out.println(n);
        // Combine Text and Variable
        String myName = "Carlos";
        System.out.println("Hello " + myName);
        // Add Variables
        String firstName = "Juan Jose ";
        String lastName = "Galvis";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        // Declare many variables
        int x = 5, y = 6, z = 48;
        System.out.println(x + y + z);
    }
}
