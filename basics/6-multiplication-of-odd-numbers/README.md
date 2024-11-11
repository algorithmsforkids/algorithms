# Problem

Find the multiplication of odd numbers `1⋅3⋅5⋅7⋅9⋅...⋅2n-1=?`.

# Solution

```java
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
```
