package chapter1;

import java.util.Scanner;

/**
 * Write a description of class Interest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interest {
    public static void main() {
        Scanner input = new Scanner(System.in);
        input.close();
        /*
         *  Type identifiers allow Java to know how to store its variables in memory
         *
         *  Numeric Types:
         *
         *    "int" stands for "integers" and holds a 32/64bit value that is by default signed
         *    "float" stands for "floating point decimal" is usually 32bit and signed;
         *        This type can hold fractional values (i.e. 1.0, 2.55, 1.3333, 10e+54, 342e-23)
         *    "double" stands for "double precision decimal and is almost always 64bit and signed;
         *        This is essentially a bigger float.
         *
         * */
        InterestCalc cal1 = new InterestCalc(0.05);
        System.out.println(cal1.doubleBalYear(10000));
//   This is the BETTER CODE!

        System.out.print("Please enter a Starting Balance: ");
//        balance = input.nextInt();
        System.out.print("Please enter a Target Balance: ");


        System.out.println("YOLO");
    }
}
