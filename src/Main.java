import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {3.5, -2.1, 8.3, -1.8, 6.4, 5.5, -21.3, -1.3, -9.9, 7.4, -14.8, 12.2, 4.6, 11.1, -10.5} ;

        int numCount = 0;

        double allNum = 0.0;

        boolean check = false;

        for (double cast: numbers) {

            if (cast<0) {

                check = true;
            }
            else if (cast>0 && check) {
                numCount++;
                allNum += cast;
                System.out.println(cast);

            }
        }

        System.out.println("Среднее арифметическое число = " + allNum / numCount);

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if (numbers[j]>numbers [j+1]) {
                    double temp = numbers [j];
                    numbers [j] = numbers [j+1];
                    numbers [j+1] = temp;
                }
            }
            System.out.println(Arrays.toString((numbers)));

        }

    }

}
