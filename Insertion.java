class Insertion{
  public static void main(String[] args){
    int i, k;

    String[] inputArray = {"Elephant","Dog","Cat","Bird","Alpaca","Buffalo"};

    for (i = 1; i < inputArray.length; i++) {
      String current = inputArray[i];
      for (k = i - 1; k >= 0; k--) {
        if (current.compareTo(inputArray[k]) > 0) {
          break;
        }
        inputArray[k + 1] = inputArray[k];
      }
      inputArray[k + 1] = current;
    }

    for(k = 0; k <inputArray.length; k ++){
      System.out.println(inputArray[k]);
    }
  }
}
