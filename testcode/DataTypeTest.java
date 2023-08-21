public class DataTypeTest {

    // Declare the variables
    public static void main(String[] args){

        //byte (-128 to 127)
        byte a = 123;
        //short (-32,768 to 32,767)
        short b = 3210;
        //int (-2,147,483,648 to 2,147,483,647)
        int c = 123456789;
        ///long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long d = 15000L;
        //float (6 to 7 decimal digits)
        float e = 50.5f;
        //double (15 decimal digits)
        double f = 60.6d;
        //boolean (true or false)
        boolean isJavaFun = true;
        //Char
        char g = 'A';
        //String
        String h = "Hello World";
    
    //print the DataType
    System.out.println("Byte: " + a);
    System.out.println("Short: " + b);
    System.out.println("Int: " + c);
    System.out.println("Long: " + d);
    System.out.println("Float: " + e);
    System.out.println("Double: " + f);
    System.out.println("Boolean: " + isJavaFun);
    System.out.println("Char: " + g);
    System.out.println("String: " + h);
    }
}