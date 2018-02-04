import java.util.Scanner;

public class Zadanie1 {
    public Zadanie1() {
        System.out.println("Podaj imię:");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();

        System.out.println("Hello " + imie + "!");
    }
}
