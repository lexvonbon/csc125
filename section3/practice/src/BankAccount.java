/* BankAccount */
public class BankAccount implements Measurable {
    private double balance;

    public BankAccount(double initBal) {
        balance = initBal;
    }
    
    public Double getMeasure() {
        return((double)balance);
    }
}