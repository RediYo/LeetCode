import java.util.ArrayList;
import java.util.List;

class MedianFinder {

  List<Integer> list;

  /** initialize your data structure here. */
  public MedianFinder() {
    list = new ArrayList<>();
  }

  public void addNum(int num) {
    list.add(num);
  }

  public double findMedian() {
    return 0;
  }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
