import java.util.Scanner;
/* LargestInt */
public class LargestInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean con = true;
        int count = 0;
        int[] list = new int[100];

        while(con) {
            if(input.hasNext("Q")) {
                con = false;
            } else if(input.hasNext("[\\D]*")) {
                System.out.println("Enter a Number!");
            } else {
                list[count] = input.nextInt();
                count += 1;
            }
        }
        input.close();
        // int[] list = {
        //     100, 20, 23, 130,
        //     546, 45, 36, 305,
        //     356, 563, 57, 56,
        // };
        int largest = 0;
        for(int item:list) {
            if(item > largest) {
                largest = item;
            }
        }
        System.out.println("The largest item in this list is: "+largest);
    }
    
}