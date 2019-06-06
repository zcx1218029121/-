
/*
 * @lc app=leetcode.cn id=69 lang=java
 *用牛顿迭代法快速求平方 
 * [69] x 的平方根
 */

class Solution {
  int s;

  public int mySqrt(int x) {
    s = x;
    if (x == 0)
      return 0;
    return ((int) (qrts(x)));
  }

  public double qrts(double x) {
    double res = (x + s / x) / 2;
    if (res == x) {
      return x;
    } else {
      return qrts(res);
    }
  }
}
