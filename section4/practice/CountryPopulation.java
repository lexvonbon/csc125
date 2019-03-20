
/**
 * Write a description of class CountryPopulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountryPopulation implements Measurable {
  private Integer population;

  public CountryPopulation(Integer countryPop) {
    population = countryPop;
  }

  public Integer getMeasurable() {
    return population;
  }
}
