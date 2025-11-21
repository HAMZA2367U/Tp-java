
public class Pivot {
    public static void main(String[] args) {
        int[] t = {2, 4, 3, 5, 6};

        for (int i = 0; i < t.length; i++) {
            boolean pivot = true;

           
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    pivot = false;
                    break;
                }
            }

            
            for (int j = i + 1; j < t.length; j++) {
                if (t[j] < t[i]) {
                    pivot = false;
                    break;
                }
            }

            if (pivot) {
                System.out.print(t[i] + " ");
            }
        }
    }
}
