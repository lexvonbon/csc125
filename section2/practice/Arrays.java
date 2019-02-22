/**
 * Arrays
 */
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        int[] scores = new int[200];
        for(int index:scores) {
            scores[index] = index*(200032 % 8);
        }
        for(int i:scores) {
            System.out.println("I = "+i);
        }
    }
}