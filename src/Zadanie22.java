import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Zadanie22 {
    public Random rand = new Random();
    public Zadanie22() {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i<=5; i++) {
            int random = rand.nextInt(10);
            while(hashSet.contains(random)) {
                random = rand.nextInt(10);
            }
            hashSet.add(random);
            random = rand.nextInt(10);
            while(treeSet.contains(random)) {
                random = rand.nextInt(10);
            }
            treeSet.add(random);
        }

        int numbers = 0;
        int sum1 = 0, sum2 = 0;
        int complemented1 = 0, complemented2 = 0;
        for (Integer number: hashSet) {
            System.out.println("Zbiór 1: " + number);
            sum1 += number;

            if (treeSet.contains(number)) {
                numbers++;
            } else {
                complemented1 += number;
            }
        }

        for (Integer number: treeSet) {
            System.out.println("Zbiór 2: " + number);
            sum2 += number;

            if (!hashSet.contains(number)) {
                complemented2 += number;
            }
        }

        System.out.println("Wspólnych liczb: " + numbers);
        System.out.println("Suma zbiorów: " + (sum1+sum2));
        System.out.println("Dopełnienie zbioru 1 i 2: " + complemented1 + " i " + complemented2);
    }
}
