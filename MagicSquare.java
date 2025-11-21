public class MagicSquare {

    public static boolean isMagic(int[][] mat) {

        int magicSum = 0;
        for (int j = 0; j < 3; j++) {
            magicSum += mat[0][j];  
        }

        
        for (int i = 1; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum != magicSum) return false;
        }

        
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += mat[i][j];
            }
            if (colSum != magicSum) return false;
        }

  
        int diag1 = mat[0][0] + mat[1][1] + mat[2][2];
        if (diag1 != magicSum) return false;

      
        int diag2 = mat[0][2] + mat[1][1] + mat[2][0];
        if (diag2 != magicSum) return false;

        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        System.out.println(isMagic(mat)); // true
    }
}