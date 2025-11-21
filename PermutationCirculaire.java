
public class PermutationCirculaire {

    public static boolean estPermutationCirculaire(int[] t) {
        int n = t.length;

        
        boolean[] vu = new boolean[n + 1]; 

        for (int x : t) {
            if (x < 1 || x > n) return false; 
            if (vu[x]) return false;          
            vu[x] = true;
        }

       
        int start = -1;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                start = i;
                break;
            }
        }

        
        for (int k = 0; k < n; k++) {
            int index = (start + k) % n; 
            if (t[index] != 1 + k) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] t1 = {4, 5, 1, 2, 3};
        int[] t2 = {1, 3, 4, 5, 2};

        System.out.println(estPermutationCirculaire(t1)); 
        System.out.println(estPermutationCirculaire(t2)); 
    }
}
