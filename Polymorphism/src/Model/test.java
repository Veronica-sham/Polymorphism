package Model;

public class test {

    public static void main(String args[]) {
        Printer a = new Printer();
        Printer b = new ColorPrinter();
        Printer c = new BnWprinter();

        System.out.println(a.Print());
        System.out.println(b.Print());
        System.out.println(c.Print());
        b.Print();
        c.Print();
    }



}
