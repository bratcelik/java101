package Bolum6;

public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0, harmonicMean;
        for (int x : numbers) {
            sum += 1d/x;
        }
        harmonicMean = numbers.length/sum;
        System.out.println("Harmonik Ortalama : " + harmonicMean);
    }

}
