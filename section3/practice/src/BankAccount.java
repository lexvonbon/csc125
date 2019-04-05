/* BankAccount */
public class BankAccount implements Measurable {
    private Double balance;

    public BankAccount(Double initBal) {
        balance = initBal;
    }
    
    public Double getMeasure() { return(getBalance()); }
    public Double getBalance() { return(balance); }
    public void depositMoney(Double deposit) { balance += deposit; }

    public Double withdrawMoney(Double amount) throws InsufficientFundsException {
        if (balance > 0) {
            if (amount > balance) {
                throw new InsufficientFundsException("You have insufficient funds to withdraw this amount.");
            }
            balance -= amount;
            return(amount);
        }
        return(Double.valueOf(0));
    }

    public int compareTo(Measurable obj) {
        if (balance < (double)obj.getMeasure()) {
            return(-1);
        } else if (balance > (double)obj.getMeasure()) {
            return(1);
        }
        return(0);
    }
}