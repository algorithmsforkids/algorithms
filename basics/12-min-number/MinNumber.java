public class MinNumber {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 1, 5, 6 };
    System.out.println(minNumber(arr));
  }

  public static int minNumber(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}

// java MinNumber.java
