
/**
 * Write a description of class Data here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Data {
   public static Object average(Measurable[] objects) {
      Double sum = 0;

      for (Measurable obj : objects) {
         if (obj.getMeasurable() instanceof java.lang.Double) {
            sum = sum + (Double) obj.getMeasurable();
         } else if (obj.getMeasurable() instanceof java.lang.Integer) {
            sum = sum + (Double) obj.getMeasurable(); 
         }           
      }

      Double average = 0;
      if (objects.length > 0) {
         average = sum/objects.length; 
      }

      return average;        
   }
}