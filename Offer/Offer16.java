public class Offer16 {

  public double myPow(double x, int n) {
    double result = x;
    if (n >= 0) {
      for (int i = 1; i < n; i++) {
        result *= x;
      }
    } else {
      for (int i = 1; i < -n; i++) {
        result *= x;
      }
      x = 1 / x;
    }

    return result;
  }
}
