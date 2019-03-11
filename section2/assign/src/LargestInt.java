/*Problem Statement III
Find the Largest In An Array.

Write a program that reads a sequence of integers, stores them in an array, and prints all of them, marking the largest value.

Use the Scanner class to read the integers and Q to quit.*/
import java.util.Scanner;

/* LargestInt */
class LargestInt {
  private static int findLargest(final int[] arr) {
    int largest = arr[0];
    for(int i = 0; i < arr.length; i += 1) {
      if(arr[i] > largest) {
        largest = arr[i];
      }
    }
    return(largest);
  }
  private static void markLargest(final int[] arr, int largest) {
    System.out.print("Array: [");
    for(int i = 0; i < arr.length; i += 1) {
      System.out.print(arr[i]);
      if(arr[i] == largest) {
        System.out.print("*");
      }
      if(i != arr.length-1) {
        System.out.print(", ");
      }
      if(i == arr.length-1) {
        System.out.print("]");
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("Enter some numbers then 'Q' to exit: ");
    Scanner opt = new Scanner(System.in);
    Stack stack = new Stack();
    while(opt.hasNextInt() || opt.hasNext("~Q")) {
      stack.push(opt.nextInt());
    }
    opt.close();

    int[] arr;
    arr = new int[stack.getLength()];
    while(stack.getLength() > 0) {
      arr[stack.getLength()-1] = stack.pop();
    }
    markLargest(arr, findLargest(arr));
  }
}