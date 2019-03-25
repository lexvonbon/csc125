import interfaces.*;
import exceptions.*;
/**
 * Main Class
 * Main Entry-point for this project
 */
public class Main {
    public static void main(String[] args) {
        BankAccount[] accts = new BankAccount[3];
        Country[] countries = new Country[3];
    
        accts[0] = new BankAccount(1236.12);
        accts[1] = new BankAccount(2656.23);
        accts[2] = new BankAccount(620626.23);
        
        countries[0] = new Country(1236);
        countries[1] = new Country(2656);
        countries[2] = new Country(620623);
    
        System.out.println(Data.average(accts));
        System.out.println(Data.average(countries));
        try {
            System.out.println(accts[0].withdrawMoney(13999.29));
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}