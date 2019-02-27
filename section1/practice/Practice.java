import java.util.Scanner;
/* {Practice} */
public class Practice {
  public boolean isEven(int num) {
      if (num % 2 == 0) {
        return(true);
      }
      return(false);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int x; //x has to be a Whole Integer, possibly negative 16bits
    float f; //f has to be Decimal, possibly negative
    x = 4;
    f = 4;

    int n = input.nextInt();

    System.out.println(x+n);
    System.out.println(f+n);
    System.out.println("1+2");

    x = input.nextInt();
    int y = input.nextInt();
    System.out.println(x+" + "+y+" = "+(x+y));

    int sum = 0;
    for(int i = 1; i < 11; i++) {
      sum += i;
    }
    System.out.println(sum);

    System.out.println("Enter a Length & Width: ");
    int l = input.nextInt();
    int w = input.nextInt();

    System.out.println("The Area is: "+(l*w)+"m");
    input.close();
  }
}