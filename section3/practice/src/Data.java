/* Data */
public class Data {
    public static Double sum(Measurable[] arr) {
        double sum = 0;
        for (Measurable object: arr) {
            if (object.getMeasure() instanceof Double) {
                sum += (double)object.getMeasure();
            } else if (object.getMeasure() instanceof Integer) {
                sum += (int)object.getMeasure();
            }
        }
        return(sum);
    }
    public static double average(Measurable[] arr) {
        if (arr.length == 0) {
            return(0);
        }
        return(sum(arr)/arr.length);
    }
}