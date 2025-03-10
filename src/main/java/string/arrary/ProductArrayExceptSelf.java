package string.arrary;

// https://leetcode.com/problems/product-of-array-except-self/description
public class ProductArrayExceptSelf {
    // TC: O(n)
    // MC: O(n)

    public int[] productExceptSelf(int[] nums) {
        int prefixProd[] = new int[nums.length];
        int suffixProdSofar = 1;
        int result[] = new int[nums.length];

        prefixProd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProd[i] = nums[i-1] * prefixProd[i-1];
        }

        for (int i = nums.length-1; i >= 0; i--) {
            result[i] = prefixProd[i] * suffixProdSofar;
            suffixProdSofar *= nums[i];
        }

        return result;
    }

}
