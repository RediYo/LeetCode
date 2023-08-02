import java.util.Arrays;

public class Offer33 {

  public boolean verifyPostorder(int[] postorder) {
    if (postorder.length <= 1) {
      return true;
    }
    //从数组最后的数字进行判断
    int len = postorder.length;
    //判断左子树是否值是否比根节点小
    int mid = 0;
    for (int i = 0; i < len; i++) {
      if (postorder[i] > postorder[len - 1]) {
        mid = i;
      }
      if (mid != 0 && postorder[i] < postorder[len - 1]) {
        return false;
      }
    }
    int[] lefts = Arrays.copyOfRange(postorder, 0, mid);
    //判断右子树是否值是否比根节点小
    int[] rights = Arrays.copyOfRange(postorder, mid, len - 2);
    boolean left = verifyPostorder(lefts);
    boolean right = verifyPostorder(rights);
    if (left && right) {
      return true;
    }
    return false;
  }
}
