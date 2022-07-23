package Generics;

public class GenericPrinter<T> { //we declare type of class
    //we declare type of varaible
    // T stands for "Things"
    T thingsToPrint;

    public GenericPrinter(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }
    public void print(){
        System.out.println(thingsToPrint);
    }
}
