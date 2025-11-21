
import java.util.HashMap;

public class Majorite {

    public static int findMajority(int[] t) {
        int n = t.length;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : t) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            if (freq.get(x) > n / 2) return x; 
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] t1 = {2, 2, 1, 2, 3};
        int[] t2 = {1, 2, 3, 4};

        System.out.println(findMajority(t1)); // 2
        System.out.println(findMajority(t2)); // -1
    }
}
