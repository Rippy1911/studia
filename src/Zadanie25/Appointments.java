package Zadanie25;

import Zadanie44.Person;

import java.util.ArrayDeque;

public class Appointments {
    private ArrayDeque<Person> Queue;
    public Appointments() {
        Queue = new ArrayDeque<>();
    }

    public void addToQueue(Person person) {
        if (Queue.size() >= 0) {
            Queue.addLast(person);
        }
    }

    public Person next() {
        Queue.removeFirst();
        return Queue.getFirst();
    }

    public Person getFirst() {
        return Queue.getFirst();
    }
}
