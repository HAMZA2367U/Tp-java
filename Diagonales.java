
public class Diagonales {

    public static int differenceDiagonales(int[][] mat) {
        int n = mat.length;
        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {
            sommePrincipale += mat[i][i];           
            sommeSecondaire += mat[i][n - 1 - i];   
        }

        return Math.abs(sommePrincipale - sommeSecondaire);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(differenceDiagonales(mat)); 
    }
}
