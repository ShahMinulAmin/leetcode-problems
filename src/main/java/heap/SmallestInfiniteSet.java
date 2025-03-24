package heap;

import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/smallest-number-in-infinite-set/
// MC: O(n)
class SmallestInfiniteSet {
    Queue<Integer> priorityQueue = new PriorityQueue<>();

    // TC: O(n)
    public SmallestInfiniteSet() {
        for (int i = 1; i <= 1000; i++) {
            priorityQueue.offer(i);
        }
    }

    // TC: O(logn)
    public int popSmallest() {
        return priorityQueue.poll();
    }

    // TC: O(logn)
    public void addBack(int num) {
        if (!priorityQueue.contains(num)) {
            priorityQueue.add(num);
        }
    }
}
