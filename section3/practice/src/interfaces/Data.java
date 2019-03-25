package interfaces;
/* Data */
public class Data {
    public static Double sum(Measurable[] arr) {
        Double sum = Double.valueOf(0); //(double)0;
        for (Measurable object: arr) {
            if (object.getMeasure() instanceof Double) {
                sum += (double)object.getMeasure();
            } else if (object.getMeasure() instanceof Integer) {
                sum += (int)object.getMeasure();
            }
        }
        return(sum);
    }
    public static Double average(Measurable[] arr) {
        if (arr.length == 0) {
            return(Double.valueOf(0));
        }
        return(sum(arr)/arr.length);
    }
}