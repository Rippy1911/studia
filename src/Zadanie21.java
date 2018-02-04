import java.util.*;

import static java.lang.Math.min;

public class Zadanie21 {
    public Zadanie21() {
        List<String> lista = new ArrayList<>();
        lista.add("test1");
        lista.add("test2");
        lista.add("test3");
        lista.add("test4");
        lista.add("test5");
        lista.add("test6");
        lista.add("test7");
        lista.add("test8");
        lista.add("test9");
        lista.add("test10");
        List<String> lista3 = lista.subList(0, min(lista.size(), 2));
        String test5 = "Test55";
        lista.add(4, test5);
        for (int i = 0; i < 2; i++) {
            lista.remove(i);
            lista.remove(lista.size()-1);
        }

        List<String> imiona = new ArrayList<String>();
        imiona.add("Adrian");
        imiona.add("Adrianna");
        imiona.add("Dominik");
        imiona.add("Karolina");
        imiona.add("Testowe imie");
        imiona.add("Michał");

        lista.addAll(imiona);

        Collections.sort(lista);

        for (String element: lista) {
            System.out.println(element);
        }
    }
}
