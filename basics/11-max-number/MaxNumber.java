public class MaxNumber {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 6, 7, 4, 5 };
    System.out.println(maxNumber(arr));
  }

  public static int maxNumber(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}

// java MaxNumber.java
