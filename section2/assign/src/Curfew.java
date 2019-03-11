/*Problem Statement I
Calculating curfew level of a user to attend a party.

Ask the user to enter their age. If the user is above the age of 13, then can go to the party. Otherwise they can't go.

If the user's age is below 17, he/she have a curfew of 10:00 pm to retun home.

Otherwise, if the user's age is above 16, the curfew is midnight.*/
import java.util.Scanner;

/* Curfew */
public class Curfew {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("So you want to go to a party?");
    System.out.print("How old are you? ");
    int age = input.nextInt();
    input.close();

    
    if(age > 13) {
      // Age > 13
      if(age > 17) {
        // Age > 17
        System.out.println("You're an adult. Why do you need permission to go out?");
      } else if(age == 17) {
        // Age = 17
        System.out.println("Your curfew is Midnight. I'll leave the key under the mat.");
      } else {
        // 17 < Age < 13 
        System.out.println("Your curfew is 10PM! You better be home by 9:59!");
      }
    } else {
      // Age =< 13
      System.out.println("Kid you need to get your homework done. Parties are for college students.");
    }
  }
}