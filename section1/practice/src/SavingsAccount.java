import java.lang.Math;
class SavingsAccount {
  private double balance;
  private double interest;
  private int age;

  public SavingsAccount(double bal, double rate) {
    age = 0;
    balance = bal;
    interest = rate;
  }

  // $balance accessors
  public void setBalance(double bal) { balance = bal; }
  public double getBalance() { return(balance); }
  
  // $interest accessors
  public void setInterest(double rate) { interest = rate; }
  public double getInterest() { return(interest); }

  // $age accessors
  public int getAge() { return(age); }

  public void depositMoney(double deposit) {
    balance += deposit;
  }
  public double withdrawMoney(double withdrawal) {
    if(balance >= withdrawal) {
      balance -= withdrawal;
      return(withdrawal);
    } else {
      System.err.println("Lacking Funds to Withdraw");
      return(0);
    }
  }

  public void age(int years) {
    age += years;
    balance += balance * Math.pow(1+interest, years);
  }
}