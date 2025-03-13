package dynamic.onedimension;

// https://leetcode.com/problems/n-th-tribonacci-number
public class NthTribonacciNumber {
    // TC: O(n) worst, O(1) best
    // MC: O(n)

    static int[] trib = new int[38];
    static {
        trib[0] = 0;
        trib[1] = 1;
        trib[2] = 1;
    }

    public int tribonacci(int n) {
        if (n <= 2) {
            return trib[n];
        }

        for (int i = 3; i <= n; i++) {
            if (trib[i] != 0) {
                continue;
            }
            trib[i] = trib[i-1] + trib[i-2] + trib[i-3];
        }

        return trib[n];
    }

}
