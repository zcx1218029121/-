/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心索引
 */
class Solution {
  // 更加索引比较左边和右边

  class Solution {
    public int pivotIndex(int[] nums) {
      if (nums.length == 0) {
        return -1;
      }

      if (nums.length == 1) {
        return 0;
      }
      int left = 0;
      int right = 0;
      // init right
      for (int i = 1; i < nums.length; i++) {
        right += nums[i];
      }
      for (int index = 0; index < nums.length; index++) {
        if (left == right) {
          return index;
        } else {
          left = left + nums[index];
          if (index + 1 != nums.length) {
            right = right - nums[index + 1];
          } else {
            return -1;
          }

        }
      }
      return -1;
    }

  }
}
