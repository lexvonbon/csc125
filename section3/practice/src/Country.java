/* Country */
public class Country implements Measurable {
    private Integer population;

    public Country(Integer initPop) {
        population = initPop;
    }

    public Integer getMeasure() {
        return(population);
    }
    
}