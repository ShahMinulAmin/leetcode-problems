package dynamic.onedimension;

// https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/569/
// Explaination here https://neetcode.io/solutions/climbing-stairs
public class ClimbStairs {
    // TC: O(n)
    // MC: O(n)
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n+1];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
        cache[0] = 1;
        cache[1] = 1;
        return fiboRecursive(n);
    }

    int fiboRecursive(int n) {
        if (cache[n] != -1) {
            return cache[n];
        }

        cache[n] = fiboRecursive(n-1) + fiboRecursive(n-2);
        return cache[n];
    }


}
