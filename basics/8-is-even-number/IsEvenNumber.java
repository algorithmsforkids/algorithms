public class IsEvenNumber {
  public static void main(String[] args) {
    System.out.println(isEvenNumber(5));
  }

  // public static boolean isEvenNumber(int n) {
  //   boolean isEven = false;
  //   if (n % 2 == 0) {
  //     isEven = true;
  //   }
  //   return isEven;
  // }
  public static boolean isEvenNumber(int n) {
    return n % 2 == 0;
  }
}

// java IsEvenNumber.java
