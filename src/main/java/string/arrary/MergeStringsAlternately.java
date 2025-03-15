package string.arrary;

// https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        // TC: O(m+n)
        // MC: O(m+n)

        char[] mergedArry = new char[word1.length() + word2.length()];

        int i = 0, j = 0, index = 0;
        while (i < word1.length() && j < word2.length()) {
            mergedArry[index++] = word1.charAt(i);
            i++;
            mergedArry[index++] = word2.charAt(j);
            j++;
        }

        if (i == word1.length()) {
            while (j < word2.length()) {
                mergedArry[index++] = word2.charAt(j);
                j++;
            }
        } else {
            while (i < word1.length()) {
                mergedArry[index++] = word1.charAt(i);
                i++;
            }
        }

        return new String(mergedArry);
    }

}
