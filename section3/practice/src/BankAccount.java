/* BankAccount */
public class BankAccount implements Measurable, Comparable {
    private Double balance;

    public BankAccount(Double initBal) {
        balance = initBal;
    }
    
    public Double getMeasure() { getBalance(); }
    public Double getBalance() { return(balance); }
    public depositMoney(Double deposit) { balance += deposit; }


    public int compareTo(Object otherA) {
        BankAccount otherAcct = (BankAccount) otherA;
        if (balance < otherAcct.getBalance()) {
            return(-1);
        } else if (balance > otherAcct.getBalance()) {
            return(1);
        }
        return(0);
    }
}