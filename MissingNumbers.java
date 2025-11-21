import java.util.HashSet;

public class MissingNumbers {

    public static void findMissing(int[] t) {
        int n = t.length;
        HashSet<Integer> set = new HashSet<>();

        
        for (int x : t) {
            set.add(x);
        }


        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] t = {1, 3, 3, 5};
        findMissing(t); // 2 4
    }
}