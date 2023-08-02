public class Offer55_1 {

  public int maxDepth(TreeNode root) {
    return track(root, 0);
  }

  public int track(TreeNode p, int level) {
    if (p != null) {
      level++;
    } else {
      return level;
    }
    int left = track(p.left, level);
    int right = track(p.right, level);

    return left > right ? left : right;
  }
}
