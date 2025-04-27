package string.arrary;

// https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
public class StringCompression {
    // TC: O(n)
    // MC: O(1)
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return chars.length;
        }

        char prev = chars[0];
        int count = 1;
        int ansIndex = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
                prev = chars[i];
            } else {
                chars[ansIndex++] = prev;
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (int j = 0;j < countStr.length(); j++) {
                        chars[ansIndex++] = countStr.charAt(j);
                    }
                }
                count = 1;
                prev = chars[i];
            }
        }

        chars[ansIndex++] = prev;
        if (count > 1) {
            String countStr = Integer.toString(count);
            for (int j = 0;j < countStr.length(); j++) {
                chars[ansIndex++] = countStr.charAt(j);
            }
        }

        return ansIndex;
    }

}
