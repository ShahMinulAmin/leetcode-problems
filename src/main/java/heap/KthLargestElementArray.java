package heap;

import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElementArray {
    // TC: O(nlogn)
    // MC: O(n)
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num : nums) {
            priorityQueue.offer(num);

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        return priorityQueue.peek();
    }

}
