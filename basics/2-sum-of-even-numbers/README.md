# Problem

Find the sum of event numbers `1+3+5+7+9+...+n=?`

# Solution

```java
public class SumOfEvenNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfEvenNumbers(2));
    System.out.println(sumOfEvenNumbers(4));
  }

  public static int sumOfEvenNumbers(int n) {
    int sum = 0;  
    for(int i = 1; i <= n; ++i) {  
      sum = sum + (2 * i - 1);  
    }
    return sum;
  }
}
```
