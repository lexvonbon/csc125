import java.lang.Math;

/**
 * Write a description of class AverageTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AverageTester {
    public static void main(String[] args) {
       BankAccount[] accounts = new BankAccount[3];
       accounts[0] = new BankAccount(343346.78);
       accounts[1] = new BankAccount(45426.67);
       accounts[2] = new BankAccount(4546.89);
       
       CountryPopulation[] pops = new CountryPopulation[3];
       pops[0] = new CountryPopulation(34543750);
       pops[1] = new CountryPopulation(35435);
       pops[2] = new CountryPopulation(34544);
       
       System.out.println("The average of the 3 account balances is "+ (double) Data.average(accounts));
       System.out.println("The average of the 3 country populations is "+ (double) Data.average(pops));
       
    }
    
}
