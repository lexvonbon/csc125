public class MinMax {
  static int max;
  static int iMax;
  static int min;
  static int iMin;

  public static void main(String[] args) {
    int[] scores = { 12, 34, 200, 0, 78, 90, 1 };
    max = scores[0];
    min = scores[0];
    System.out.print("Scores:");
    for (int i = 0; i < scores.length; i += 1) {
      System.out.print(" [" + i + "](" + scores[i] + ")");
    }
    System.out.print("\n");
    for (int i = 0; i < scores.length; i += 1) {
      if (scores[i] > max) {
        iMax = i;
        max = scores[i];
      }
      if (scores[i] < min) {
        iMin = i;
        min = scores[i];
      }
    }
    System.out.println("The Maximum value of Scores is: " + max + " At Index: " + iMax);
    System.out.println("The Minimum value of Scores is: " + min + " At Index: " + iMin);
  }
}