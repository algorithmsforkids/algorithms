public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfNaturalNumbers(3));
  }

  public static int sumOfNaturalNumbers(int n) {
    int sum = 0;  
    for (int i = 1; i <= n; ++i) {
      sum = sum + i;
    }
    return sum;
  }
}

// java SumOfNaturalNumber.java
