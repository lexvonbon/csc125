import java.util.Scanner;
import java.io.*;

class Iffy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (str == "" || str.length() == 0) {
            System.out.println("This string is empty!");
        }
        input.close();
    }
}