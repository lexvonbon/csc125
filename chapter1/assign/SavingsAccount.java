/**
 * SavingsAccount Class
 * 
 * @author Lex von Biedenfeld
 * @version 1.0
 * 
 * @since 20190214
 * 
 */

 class SavingsAccount {
  private double balance;

  public SavingsAccount(double bal) {
    setBalance(bal);
  }

  public void setBalance(double bal) {
    balance = bal;
  }
  public double getBalance() {
    return(balance);
  }

  public void addInterest(double i) {
    balance += balance*i;
  }
}