import java.util.Scanner;

public class Zadanie2 {
        Scanner scanner = new Scanner(System.in);

        public Zadanie2() {

            System.out.println("imie: ");
            String imie = scanner.nextLine();

            System.out.println("nazwisko ");
            String nazwisko = scanner.nextLine();

            System.out.println("Mieszkasz sam?");
            String zkim = scanner.nextLine();

            System.out.println("wiek: ");
            String wiek = scanner.nextLine();

            System.out.println("Ile masz zwierzat? ");
            String zwierzeta = scanner.nextLine();

            System.out.println("Gdzie mieszkasz? ");
            String dom = scanner.nextLine();

            System.out.println("Podaj swoje wyksztalcenie ");
            String wyksztalcenie = scanner.nextLine();

            System.out.println("Podaj swoj stan cywilny ");
            String stan = scanner.nextLine();

            System.out.println("Nazywasz sie: " +imie +nazwisko);
            if (zkim == "tak") {
                System.out.println("Mieszkasz sam");
            } else {
                System.out.println("Mieszkasz u kogoś");
            }
            System.out.println("Masz: " + wiek +" lat");
            System.out.println("Masz: " + zwierzeta +" zwierzat");
            System.out.println("Mieszkasz w: " + dom);
            System.out.println("Masz wyksztalcenie: " +wyksztalcenie);
            System.out.println("Twoj stan cywilny to: " +stan);
        }
}
