import java.util.Scanner;

public class Zadanie1 {
    public Zadanie1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj imie:");
        String name = input.nextLine();

        System.out.println("Hello: " + name);
    }
}
