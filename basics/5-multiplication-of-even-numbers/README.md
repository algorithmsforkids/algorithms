# Problem

Find the multiplication of even numbers `2⋅4⋅6⋅8⋅10⋅...⋅2n=?`.

# Solution

```java
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
```
