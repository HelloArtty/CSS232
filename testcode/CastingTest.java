public class CastingTest {

    public static void main(String[] args){
        int a = 45; //int
        double b = a; //cast int to double
        double c = 5464.5123; //double
        int d = (int) c; //cast double to int

        long e = d*9564; //long

        //print the variables
        System.out.println("Int: " + a);
        System.out.println("After converting to double: " + b);
        System.out.println("Double: " + c);
        System.out.println("After converting to Int: " + d);
        System.out.println("Long: " + e);
    }
}
