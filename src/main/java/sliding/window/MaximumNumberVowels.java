package sliding.window;

// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
public class MaximumNumberVowels {
    // TC: O(n)
    // MC: O(n)
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        boolean[] vowel = new boolean[chars.length];
        int winStartIndex = 0;
        int currentWinLen = 0;
        int maxWinLen = 0;

        // first window
        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                vowel[i] = true;
                if (currentWinLen < k) currentWinLen++;
            } else {
                vowel[i] = false;
            }
        }
        maxWinLen = currentWinLen;

        for (int i = k; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowel[i] = true;
                if (!vowel[winStartIndex] && currentWinLen < k) {
                    currentWinLen++;
                }
            } else {
                vowel[i] = false;
                if (vowel[winStartIndex] && currentWinLen > 0) {
                    currentWinLen--;
                }
            }

            // update max win length
            if (currentWinLen > maxWinLen) {
                maxWinLen = currentWinLen;
            }
            winStartIndex++;
        }

        return maxWinLen;
    }

    public boolean isVowel(char ch) {
        return (ch == 'a'
                || ch == 'e'
                || ch == 'i'
                || ch == 'o'
                || ch == 'u');
    }
}
