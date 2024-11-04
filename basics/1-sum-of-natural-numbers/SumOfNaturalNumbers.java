public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfNaturalNumber(2));
    System.out.println(sumOfNaturalNumber(4));
  }

  public static int sumOfNaturalNumber(int n) {
    int sum = 0;  
    for(int i = 1; i <= n; ++i) {  
      sum = sum + i;  
    }
    return sum;
  }
}

// java SumOfNaturalNumbers.java