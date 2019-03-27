import java.util.Random;

/**
 * Arrays
 */
class Arrays {

    public static void main(String[] args) {
        int[] scores = new int[200];
        Random numGen = new Random(200);
        for(int index:scores) {
            scores[index] = index*numGen.nextInt();
        }
        for(int i:scores) {
            System.out.println("I = "+i);
        }
    }
}