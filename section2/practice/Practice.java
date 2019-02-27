class Practice {
    public static void main(String[] args) {
        double[] scores = {12.3, 123.42,21312.4, 213.4,36.563,46747.76};
        double sum = 0.0;

        for(double score:scores) {
            sum += score;
        }
        double average = 0.0;
        if(sum > 0 && scores.length > 0) {
            average = sum / scores.length;
        }
        System.out.println("The sum of the scores is: "+sum);
        System.out.println("The average score is: "+average);
    }
    
}