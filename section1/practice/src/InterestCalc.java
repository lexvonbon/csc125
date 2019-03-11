package section1.practice;


/**
 * Write a description of class InterestCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InterestCalc {
    // instance variables - replace the example below with your own
    private static double INTEREST_RATE;
    
    /**
     * Constructor for objects of class InterestCalc
     */
    public InterestCalc(double interest) {
        // initialise instance variables
        INTEREST_RATE = interest;
    }
    public double getInterestRate() {
        return(INTEREST_RATE);
    }
    /**
     * Finds what year a balance doubles with this interest rate
     *
     * @param  balance  a balance of double type
     * @return  int year
     */
    public int doubleBalYear(double balance) {
        int year = 0;
        double accrued = 0;

        //   This is the BETTER CODE!
        while(accrued < 2*balance) {
             year += 1;
             accrued = balance*Math.pow(1+getInterestRate(), year);
        }

        return(year);
    }
}
