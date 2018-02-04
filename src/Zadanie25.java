import Zadanie44.Person;

import Zadanie25.Appointments;

public class Zadanie25 {
    public Zadanie25() {
        Person Andrzej = new Person("Test", "test");
        Person Test = new Person("Dom", "com");
        Appointments queue = new Appointments();

        queue.addToQueue(Andrzej);
        queue.addToQueue(Test);

        System.out.println(queue.getFirst().getFullname());
        System.out.println(queue.next().getFullname());
        System.out.println(queue.getFirst().getFullname());
    }
}
