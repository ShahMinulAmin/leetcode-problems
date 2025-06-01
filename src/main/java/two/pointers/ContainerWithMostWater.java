package two.pointers;

// https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=leetcode-75
public class ContainerWithMostWater {
    // TC: O(n)
    // MC: O(1)
    public int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int maxArea = 0;

        while (leftIndex <= rightIndex) {
            int currentHeight = Math.min(height[leftIndex], height[rightIndex]);
            int currentArea = currentHeight * (rightIndex - leftIndex);
            maxArea = Math.max(maxArea, currentArea);

            // update either of the pointers
            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }

}
