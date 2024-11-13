public class ReverseNumber {
  public static void main(String[] args) {
    System.out.println(reverseNumber(1824));
  }

  public static int reverseNumber(int n) {
    int rev = 0;
    int rem;
    while (n > 0) {
      rem = n % 10;
      rev = (rev * 10) + rem;
      n = n / 10;
    }
    return rev;
  }
}

// java ReverseNumber.java
