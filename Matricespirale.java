
public class Matricespirale {
	public static int[][] fillSpiral(int n) {
        int[][] a = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int val = 1;

        while (left <= right && top <= bottom) {

            
            for (int j = left; j <= right; j++) {
                a[top][j] = val++;
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                a[i][right] = val++;
            }
            right--;

            
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    a[bottom][j] = val++;
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    a[i][left] = val++;
                }
                left++;
            }
        }

        return a;
    }

	
    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3; 
        int[][] m = fillSpiral(n);
        printMatrix(m);
    }
}
