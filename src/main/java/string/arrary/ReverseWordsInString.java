package string.arrary;

public class ReverseWordsInString {
    // https://leetcode.com/problems/reverse-words-in-a-string/description/
    // TC: O(n)
    // MC: O(n)

    public String reverseWords(String s) {
        s = s.trim();
        String[] strArray = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strArray.length-1; i >= 0; i--) {
            sb.append(strArray[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
