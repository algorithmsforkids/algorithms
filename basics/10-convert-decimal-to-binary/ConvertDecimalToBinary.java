public class ConvertDecimalToBinary {
  public static void main(String[] args) {
    System.out.println(convertDecimalToBinary(7));
  }

  public static String convertDecimalToBinary(int n) {
    int quotient = n;
    int remainder = 0;
    String binaryNumber = "";
    while (quotient > 0) {
      remainder = quotient % 2;
      binaryNumber = remainder + binaryNumber;
      quotient = quotient / 2;
    }
    return binaryNumber;
  }
}

// java ConvertDecimalToBinary.java
