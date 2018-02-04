import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        int[] cyfry = new int[3];
        Scanner scanner = new Scanner(System.in);

        int najwieksza = 0;

        for (int a = 0; a < cyfry.length; a++) {
            System.out.print("Podaj " + (a + 1) + " liczbe:");
            cyfry[a] = scanner.nextInt();
            if (cyfry[a] > najwieksza){
                najwieksza = cyfry[a];
            }
        }

        System.out.println("Najwieksza liczba to: " + najwieksza);

    }
}
