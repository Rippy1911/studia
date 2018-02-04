import Zadanie44.Person;

import java.util.ArrayList;
import java.util.List;

public class Zadanie24 {
    public Zadanie24() {
        List<Person> People = new ArrayList<>();
        Person Andrzej = new Person("andrzej", "T");
        People.add(Andrzej);
        Person Adrianna = new Person("Adrianna", "T");
        People.add(Adrianna);
        Person Dorota = new Person("Dorota", "T");
        People.add(Dorota);
        Person Maciek = new Person("Maciek", "T");
        People.add(Maciek);

        List<Person> RemovePeople = new ArrayList<>();
        for (Person person: People) {
            String firstLetter = person.getFirstName().substring(0, 1).toUpperCase();
            if (firstLetter.equals("A")) {
                RemovePeople.add(person);
            }
        }

        for (Person person: RemovePeople) {
            People.remove(person);
        }

        for (Person person: People) {
            System.out.println(People.indexOf(person) + ": " + person.getFullname());
        }
    }
}
