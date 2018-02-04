import java.util.Scanner;

public class Zadanie4 {
    private static final int cyfry = 5;
    int i = 0;
    int max = 0;
    Scanner input = new Scanner(System.in);

    public Zadanie4() {
        while (i <= cyfry - 1) {
            System.out.print("Podaj " + (i + 1) + " liczbę: ");
            int number = input.nextInt();

            if (i == 0) {
                max = number;
            }

            max = Math.max(max, number);

            i++;
        }

        System.out.println("Największa liczba to: " + max);


        private static int check ( int x, int y){

            if (x >= y) {
                return x;
            }

            return y;
        }
    }