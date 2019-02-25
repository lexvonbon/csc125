/**
 * LargestInt
 */
public class LargestInt {
    public static void main(String[] args) {
        int[] list = {
            100, 20, 23, 130,
            546, 45, 36, 305,
            356, 563, 57, 56,
        };
        int largest = 0;
        for(int item:list) {
            if(item > largest) {
                largest = item;
            }
        }
        System.out.println("The largest item in this list is: "+largest);
    }
    
}