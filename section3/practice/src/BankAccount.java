/* BankAccount */
public class BankAccount implements Measurable, Comparable {
    private Double balance;

    public BankAccount(Double initBal) {
        balance = initBal;
    }
    
    public Double getMeasure() { return(getBalance()); }
    public Double getBalance() { return(balance); }
    public void depositMoney(Double deposit) { balance += deposit; }

    public int compareTo(Measurable obj) {
        if (balance < obj.getMeasure()) {
            return(-1);
        } else if (balance > obj.getMeasure()) {
            return(1);
        }
        return(0);
    }
}