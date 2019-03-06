/*Problem Statement III
Find the Largest In An Array.

Write a program that reads a sequence of integers, stores them in an array, and prints all of them, marking the largest value.

Use the Scanner class to read the integers and Q to quit.*/
import java.util.Scanner;

class LargestInt {
  static Scanner opt = new Scanner(System.in);
  public static void main(String[] args) {
    int[] arr = new int[100];
    int index = 0;
    while(opt.hasNextInt()) {
      arr[index] = opt.nextInt();
      index += 1;
    }
    int largest = 0;
    for(int i:arr) {
      if(i > 0) {
        System.out.print(i+", ");
      }
    }
  }
}