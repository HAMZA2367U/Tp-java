public class Kadane {

    public static int maxSubArraySum(int[] t) {
        int currentSum = t[0];
        int maxSum = t[0];

        for (int i = 1; i < t.length; i++) {
            currentSum = Math.max(t[i], currentSum + t[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] t = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Somme maximale d'une sous-suite contiguë = " + maxSubArraySum(t));
    }
}
