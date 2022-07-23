package Generics;

public class StringPrinter {
    //to print String value

    String thingsToPrint;

    public StringPrinter(String thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }
    public void print(){
        System.out.println(thingsToPrint);
    }
}
