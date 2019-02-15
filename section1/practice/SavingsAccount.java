package section1.practice;

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
