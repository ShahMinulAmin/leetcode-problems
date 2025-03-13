package binary.search;

// https://leetcode.com/problems/guess-number-higher-or-lower/description
public class GuessNumberHigherLower {
    // TC: O(log2n)
    // TC: O(1)
    public int guessNumber(int n) {
        int lower = 1;
        int upper = n;

        int res = guess(n);
        if (res == 0) return n;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            res = guess(mid);
            if (res == 0) {
                return mid;
            }
            else if (res == 1) {
                // guess is less, move lower range up
                lower = mid + 1;
            }
            else if (res == -1) {
                // guess is more, move upper range down
                upper = mid - 1;
            }
        }

        return -1;
    }

}
