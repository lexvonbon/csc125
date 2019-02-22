import java.util.Scanner;
class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        input.close();
        int i = 0;
        while(string.charAt(i) != ' ' & i < string.length()) {
            i += 1;
        }
        System.out.println("The string: "+string+" has its first space at index: "+i);
    }
}