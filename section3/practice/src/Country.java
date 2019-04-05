/* Country */
public class Country implements Measurable {
    private Integer population;

    public Country(Integer initPop) {
        population = initPop;
    }

    public Integer getMeasure() { return(getPopulation()); }
    public Integer getPopulation() { return(population); }
    public void setPopulation(int pop) { population += pop; }

    public int compareTo(Measurable obj) {
        if (population < (int)obj.getMeasure()) {
            return(-1);
        } else if (population > (int)obj.getMeasure()) {
            return(1);
        }
        return(0);
    }
}