public class LowerCase {
  public static void main(String[] args) {
    System.out.println(toLowerCase("ABC").equals("ABC".toLowerCase()));
    System.out.println(toLowerCase("ABC123").equals("ABC123".toLowerCase()));
    System.out.println(toLowerCase("abcABC").equals("abcABC".toLowerCase()));
    System.out.println(toLowerCase("abc123ABC").equals("abc123ABC".toLowerCase()));
  }

  public static String toLowerCase(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; ++i) {
      if (Character.isLetter(chars[i]) && Character.isUpperCase(chars[i])) {
        chars[i] = Character.toLowerCase(chars[i]);
      }
    }
    return new String(chars);
  }
}

// java LowerCase.java
