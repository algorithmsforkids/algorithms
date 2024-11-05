public class SumOfEvenNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfEvenNumbers(3));
  }

  public static int sumOfEvenNumbers(int n) {
    int sum = 0;  
    for(int i = 1; i <= n; ++i) {  
      sum = sum + (2 * i - 1);  
    }
    return sum;
  }
}

// java SumOfEvenNumbers.java
