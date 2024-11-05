public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfNaturalNumbers(2));
    System.out.println(sumOfNaturalNumbers(4));
  }

  public static int sumOfNaturalNumbers(int n) {
    int sum = 0;  
    for(int i = 1; i <= n; ++i) {  
      sum = sum + i;  
    }
    return sum;
  }
}

// java SumOfNaturalNumber.java
