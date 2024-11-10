public class MultiplicationOfEvenNumbers {
  public static void main(String[] args) {
    System.out.println(multiplicationOfEvenNumbers(3));
  }

  public static int multiplicationOfEvenNumbers(int n) {
    int mul = 1;
    for (int i = 1; i <= n; ++i) {
      mul = mul * (2 * i);
    }
    return mul;
  }
}

// java MultiplicationOfEvenNumbers.java
