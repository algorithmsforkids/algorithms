public class SumOfOddNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfOddNumbers(3));
  }

  public static int sumOfOddNumbers(int n) {
    int sum = 0;  
    for (int i = 1; i <= n; ++i) {  
      sum = sum + (2 * i - 1);  
    }
    return sum;
  }
}

// java SumOfOddNumbers.java
