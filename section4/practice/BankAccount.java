
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount implements Measurable {
   private Double balance;

   public BankAccount(Double acctBalance) {
      balance = acctBalance;
   }

   public Double getMeasurable() {
      return balance;
   }
}
