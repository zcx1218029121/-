/*
 * @lc app=leetcode.cn id=997 lang=java
 *
 * [997] 找到小镇的法官
 */

class Solution {
  public int findJudge(int N, int[][] trust) {
    // 遍历数组的第一个数字 如果没有出现过就表示满足条件1
    // 遍历数组的第二个数字，
    /**
     * key 为标记 value 为被信赖的数量
     */
    if (N == 1)
      return 1;
    HashMap<Integer, Integer> beTrust = new HashMap<>();

    for (int[] temp : trust) {
      if (beTrust.containsKey(temp[1])) {
        beTrust.put(temp[1], beTrust.get(temp[1]) + 1);
      } else {
        beTrust.put(temp[1], 1);
      }
    }
    for (int[] t : trust) {
      if (beTrust.containsKey(t[0])) {
        beTrust.remove(t[0]); // 不满足条件1 直接排除
      }
    }
    for (Map.Entry<Integer, Integer> e : beTrust.entrySet()) {
      if (e.getValue() == N - 1) {
        return e.getKey();
      }
    }
    return -1;
  }
}