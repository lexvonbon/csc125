/**
 * SavingsAccount Class
 * Write a class named SavingsAccount with an option to deposit money and check
 * balance with a variable interest rate.
 * Write a SavingsAccountRunner class that constructs a savingsAccount object,
 * reads from file the account deposit and interest rate.
 * 
 * @author Lex von Biedenfeld
 * @version 1.0
 * 
 * @since 2019-02-14
 * 
 */
class SavingsAccount {
  private Double balance;

  // Constructors
  public SavingsAccount(double balance) {
    // Don't do setBalance(balance);
    this.balance = balance;
  }
  // -----

  public void setBalance(double bal) {
    balance = bal;
  }
  public Double getBalance() {
    return(balance);
  }
  public void depositMoney(Double deposit) {
    if (deposit > 0) {
      balance += deposit;
    }
  }
  public Double withdrawMoney(Double amount) {
    if (balance > 0 && amount >= balance) {
      balance -= amount;
      return(amount);
    }
    return(0.0);
  }

  public void addInterest(double i) {
    balance += balance*i;
  }
}