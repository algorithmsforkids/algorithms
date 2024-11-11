public class MultiplicationOfOddNumbers {
  public static void main(String[] args) {
    System.out.println(multiplicationOfOddNumbers(3));
  }

  public static int multiplicationOfOddNumbers(int n) {
    int mul = 1;
    for (int i = 1; i <= n; ++i) {
      mul = mul * (2 * i - 1);
    }
    return mul;
  }
}

// java MultiplicationOfOddNumbers.java
