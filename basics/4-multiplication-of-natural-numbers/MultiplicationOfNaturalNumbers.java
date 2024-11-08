public class MultiplicationOfNaturalNumbers {
  public static void main(String[] args) {
    System.out.println(multiplicationOfNaturalNumbers(3));
  }

  public static int multiplicationOfNaturalNumbers(int n) {
    int mul = 1;
    for (int i = 1; i <= n; ++i) {
      mul = mul * i;
    }
    return mul;
  }
}

// java MultiplicationOfNaturalNumbers.java
