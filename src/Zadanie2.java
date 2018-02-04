import java.util.Scanner;

public class Zadanie2 {
    public Zadanie2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj adres");
        String adres = scanner.nextLine();

        System.out.println("Ile masz zwierząt?");
        String zwierzeta = scanner.nextLine();

        System.out.println("Czy masz auto? Tak/Nie");
        String auto = scanner.nextLine();
        auto = auto.toLowerCase();

        System.out.println("Jaki masz telefon");
        String telefon = scanner.nextLine();

        System.out.println("Do jakiej szkoły chodzisz");
        String szkola = scanner.nextLine();

        System.out.println("Czy mieszkasz z rodzicami? Tak/Nie");
        String mieszkaszURodzicow = scanner.nextLine();
        mieszkaszURodzicow = mieszkaszURodzicow.toLowerCase();

        System.out.println("Nazywasz się " +
                imie + " " + nazwisko);
        System.out.println("Mieszkasz " + (mieszkaszURodzicow == "tak" ? "z rodzicami" : "sam") + " w " + adres);
        System.out.println("Masz " + zwierzeta + " zwierząt");
        System.out.println((auto == "tak" ? "Posiadasz auto" : "Nie posiadasz auta"));
        System.out.println("Twoj telefon to: " + telefon);
        System.out.println("Chodzisz do " + szkola);
    }
}
