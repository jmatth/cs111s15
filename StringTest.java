class StringTest{
  public static void main(String[] args){
    System.out.print("Enter a string: ");
    String mystr = IO.readString();

    String reversed = "";
    for (int i = mystr.length() - 1; i >= 0; i--) {
      reversed += mystr.charAt(i);
    }

    System.out.println(reversed);
  }
}
