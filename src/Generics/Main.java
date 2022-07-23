package Generics;

import Generics.GenericPrinter;

public class Main {
    public static void main(String[] args) {

        //Without Generic if we want to print string and Int value with class
        //String print
        StringPrinter s = new StringPrinter("Ilham");
        s.print();
        //Integer print
        IntegerPrinter i = new IntegerPrinter(23);
        i.print();

        // --------------------With Generic---------------------------
        // now we dont need everytime to create new class to insert different types

        // ----------------Warning--------------
        // Generic doesn't work with primitives like (int, long, short)
        //you should use their wrapper type : int -Integer, long - Long, short - Short

        GenericPrinter<String> stringGenericPrinter = new GenericPrinter<>("this is String");
        stringGenericPrinter.print();

        GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<>(2022);
        integerGenericPrinter.print();

    }
}