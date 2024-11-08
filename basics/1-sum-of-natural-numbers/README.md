# Problem

Find the sum of natural numbers `1+2+3+4+5+...+n=?`.

# Solution

```java
public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    System.out.println(sumOfNaturalNumbers(2));
    System.out.println(sumOfNaturalNumbers(4));
  }

  public static int sumOfNaturalNumbers(int n) {
    int sum = 0;  
    for (int i = 1; i <= n; ++i) {  
      sum = sum + i;  
    }
    return sum;
  }
}
```
