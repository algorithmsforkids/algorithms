public class ReverseString {
  public static void main(String[] args) {
    System.out.println(reverseString("abc123").equals("321cba"));
    System.out.println(reverseString("321cba").equals("abc123"));
  }

  public static String reverseString(String str) {
    if (str == null || str.isEmpty()) {
      return str;
    }
    char[] reverseStr = str.toCharArray();
    for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
      char temp = reverseStr[i];
      reverseStr[i] = reverseStr[j];
      reverseStr[j] = temp;
    }
    return new String(reverseStr);
  }
}

// java ReverseString.java
