/*Problem Statement II
Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
Also compute and display the average.
The output shall look like:

The sum is 5050
The average is 50.5*/
class SumAndAverage {
  static int sum;
  static double avg;
  public static void main(String[] args) {
    for(int i = 0; i < 101; i += 1) {
      sum += i;
    }
    avg = sum / 100.0;
    System.out.println("The sum is "+sum);
    System.out.println("The average is "+avg);
  }
}