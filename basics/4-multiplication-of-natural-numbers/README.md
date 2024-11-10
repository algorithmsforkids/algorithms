# Problem

Find the multiplication of natural numbers `1⋅2⋅3⋅4⋅5⋅...⋅n=?`.

# Solution

```java
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
```
