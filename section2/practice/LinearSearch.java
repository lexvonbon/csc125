/**
 * LinearSearch
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] values = new int[100];
        int searchedValue = 100;
        int pos = 0;

        boolean found = false;
        while(pos < values.length && !found) {
            if(values[pos] == searchedValue) {
                found = true;
            }
            pos += 1;
        }
    }
}