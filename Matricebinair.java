import java.util.Stack;

public class Matricebinair{

    
    public static int[] largestRectangleInHistogram(int[] h) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int left = 0, right = 0, height = 0;

        int n = h.length;
        for (int i = 0; i <= n; i++) {
            int current = (i == n ? 0 : h[i]);

            while (!stack.isEmpty() && current < h[stack.peek()]) {
                int top = stack.pop();
                int hRect = h[top];

                int start = (stack.isEmpty() ? 0 : stack.peek() + 1);
                int end = i - 1;

                int area = hRect * (end - start + 1);

                if (area > maxArea) {
                    maxArea = area;
                    left = start;
                    right = end;
                    height = hRect;
                }
            }

            stack.push(i);
        }

        return new int[]{maxArea, left, right, height};
    }

    public static void findMaxRectangle(int[][] m) {
        int rows = m.length;
        int cols = m[0].length;

        int[] h = new int[cols];
        int maxArea = 0;
        int finalTop = 0, finalLeft = 0, finalBottom = 0, finalRight = 0;

        for (int i = 0; i < rows; i++) {


            for (int j = 0; j < cols; j++) {
                if (m[i][j] == 1) h[j]++;
                else h[j] = 0;
            }

            int[] result = largestRectangleInHistogram(h);
            int area = result[0];
            int left = result[1];
            int right = result[2];
            int height = result[3];

            if (area > maxArea) {
                maxArea = area;
                finalTop = i - height + 1;
                finalBottom = i;
                finalLeft = left;
                finalRight = right;
            }
        }

        System.out.println("Plus grand rectangle = " + maxArea);
        System.out.println("Coordonnées :");
        System.out.println("Top-left     = (" + finalTop + ", " + finalLeft + ")");
        System.out.println("Bottom-right = (" + finalBottom + ", " + finalRight + ")");
    }

    public static void main(String[] args) {
        int[][] m = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 0}
        };

        findMaxRectangle(m);
    }
}

