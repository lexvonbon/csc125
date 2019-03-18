/* Country */
public class Country implements Measurable {
    private int population;

    public Country(int initPop) {
        population = initPop;
    }

    public Integer getMeasure() {
        return((int)population);
    }
    
}