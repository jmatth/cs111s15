public class Subsequence {

  public static void main(String[] args) {
    String str = IO.readString();
    System.out.println("Longest subsequence is " + longest(str));
  }

  public static String longest(String str) {

    if (str == null || str.length() < 1) {
      return "";
    }

    //aabbbbc
    //  ^
    //longest_char = a
    //longest_count = 1

    char longest_char = str.charAt(0);
    int longest_count = 1;
    char current_char = str.charAt(0);
    int current_count = 1;

    for (int i = 1; i < str.length(); i++) {
      char tmp_char = str.charAt(i);

      if (tmp_char == current_char) {
        // still counting...
        current_count++;
      } else {
        //found a new character
        if (current_count > longest_count) {
          // was the last character the new longest subsequence?
          longest_count = current_count;
          longest_char = current_char;
        }

        // start counting the new character
        current_char = tmp_char;
        current_count = 1;
      }
    }

    if (current_count > longest_count) {
      // was the last subsequence the longest?
      longest_count = current_count;
      longest_char = current_char;
    }

    return "" + longest_char;
  }
}
