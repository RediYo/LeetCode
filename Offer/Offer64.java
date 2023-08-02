public class Offer64 {

  public int sumNums(int n) {
    return track(1, n);
  }

  int track(int left, int right) {
    if (left == right) {
      return left;
    } else if (left > right) {
      return 0;
    }

    return left + right + track(left + 1, right - 1);
  }
}
