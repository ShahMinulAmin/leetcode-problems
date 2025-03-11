package hashset;

import java.util.Arrays;

public class DetermineTwoStringsClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];
        for (char ch : word1.toCharArray()) {
            frequency1[ch - 'a']++;
        }
        for (char ch : word2.toCharArray()) {
            frequency2[ch - 'a']++;
        }

        // check whether two words contain same alphabets
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] == 0 && frequency2[i] > 0) {
                return false;
            }
            else if (frequency1[i] > 0 && frequency2[i] == 0) {
                return false;
            }
        }

        // check whether list of frequencies match
        Arrays.sort(frequency1);
        Arrays.sort(frequency2);
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

}
