/**
 * MeasurableTester
 */
public class MeasurableTester {
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
    }
}