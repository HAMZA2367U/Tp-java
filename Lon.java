


	public class Lon{
	    public static int lis(int[] t) {
	        int n = t.length;
	        int[] dp = new int[n]; 
	        
	        for (int i = 0; i < n; i++) {
	            dp[i] = 1;
	        }

	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (t[j] < t[i]) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	        }

	       
	        int max = 1;
	        for (int x : dp) {
	            if (x > max) max = x;
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        int[] t = {2, 1, 4, 2, 3, 5, 1, 7};
	        System.out.println("longue sous-séquence strictement croissante =" + lis(t));
	    }
	}
