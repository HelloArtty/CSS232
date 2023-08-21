public class OperatorsTest {

    public static void main (String[] args){
        
        //int some variables
        int a = 9;
        int b = 9;

        //print the variables
        int result_add = a + b; //addition
        System.out.println("a + b = " + result_add); //18

        ++result_add; //increment
        System.out.println("Increment Result of addition= " + result_add); //19

        double result_mod = result_add % b; //modulus
        System.out.println("Modulus = " + result_mod); //1.0

        a+=5; //addition assignment
        System.out.println("Reslut of variable a = " + a); //14

        System.out.println("Bitwise of 2 | 1 = "+ (2 | 1)); //Bitwise OR

        boolean compare_ab = (a == b); //compare
        System.out.println("compare a and b = " + compare_ab); //false

        boolean logical_ab = (a < 5 && b > 8); //Logical AND
        System.out.println("logial a and b  = " + logical_ab); //false
    }
}
