package com.alex.leetcode.solution.Q1046_Last_Stone_Weight;

/***
 * We have a collection of rocks, each rock has a positive integer weight.
 *
 * Each turn, we choose the two heaviest rocks and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 *
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 *
 *
 *
 * Example 1:
 *
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 *
 *
 * Note:
 *
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 *
 *
 */
public class Q1046 {

    public static void main(String[] args) {
        Q1046 q1046 = new Q1046();
        int[] stones = new int[] {1, 3};
        System.out.println(q1046.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        int[] arr = new int[10001];
        for (int weight : stones) {
            arr[weight]++;
        }

        int curr = 1000;
        int prev = 10001;
        while (curr >= 0) {
            if (arr[curr] > 0) {
                if (prev != 10001) {
                    int newWeight = prev - curr;
                    arr[newWeight]++;
                    arr[prev]--;
                    arr[curr]--;

                    if (newWeight >= curr) {
                        curr = newWeight;
                    }
                }

                if (arr[curr] > 1) {
                    arr[curr] %= 2;
                }

                if (arr[curr] == 1) {
                    prev = curr;
                } else {
                    prev = 10001;
                }
            }

            curr--;
        }

        return prev == 10001? 0 : prev;
    }
}
