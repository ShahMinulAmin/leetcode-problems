package string.arrary;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/
public class GreatestCommonDivisorStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int length1 = str1.length();
        int length2 = str2.length();
        int gcdValue = length1 > length2 ?
                gcd(length1, length2): gcd(length2, length1);

        return str1.substring(0, gcdValue);
    }


    // TC: O(log min(a, b))
    // GCD using Euclidean algorithm
    public int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);
    }

}
