package backtracking;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/793/
public class LetterCombinationsPhoneNumber {
    // TC: O(n * 4^n)
    // MC: O(n)
    public static String[] buttons = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> resultList = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        backtrack(digits, 0, "");
        return resultList;
    }

    public void backtrack(String digits, int index, String result) {
        if (result.length() == digits.length()) {
            resultList.add(result);
            return;
        }

        int buttonIndex = digits.charAt(index) - '0';
        String button = buttons[buttonIndex];
        for (int i = 0; i < button.length(); i++)  {
            backtrack(digits, index + 1, result + button.charAt(i));
        }
    }
}
