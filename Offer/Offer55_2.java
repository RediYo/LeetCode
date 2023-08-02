public class Offer55_2 {

  boolean flag = true;

  public boolean isBalanced(TreeNode root) {
    track(root, 0);
    return flag;
  }

  public int track(TreeNode p, int level) {
    if (p != null) {
      level++;
    } else {
      return level;
    }
    int left = track(p.left, level);
    int right = track(p.right, level);

    if (flag) {
      flag = Math.abs(left - right) > 1 ? false : true;
    }

    return left > right ? left : right;
  }
}
