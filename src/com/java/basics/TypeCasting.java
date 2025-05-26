package com.java.basics;

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting - conversión automática
        int intTy = 9;
        double doubleTy = intTy; // Automatic casting: int to double

        System.out.println(intTy);
        System.out.println(doubleTy);

        // Narrowing Casting - conversión explícita)
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Explicit casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}