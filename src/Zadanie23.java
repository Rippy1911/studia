import java.util.HashMap;

public class Zadanie23 {
    private Integer y = 50;
    private Integer x = 10;
    public Zadanie23() {
        HashMap<Integer, Integer> map = new HashMap<>((x+1));

        for(int i = 1; i <= y; i++) {
            int random = this.randomize(x);

            if (map.containsKey(random)) {
                int num = map.get(random) + 1;
                map.remove(random);
                map.put(random, num);
            } else {
                map.put(random, 1);
            }
        }

        for(Integer index: map.keySet()) {
            System.out.println(index + " = " + map.get(index));
        }
    }

    public Integer randomize(Integer max) {
        return (int) (Math.random() * max) + 1;
    }
}
