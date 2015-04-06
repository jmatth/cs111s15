class Rota180{
  public static void main(String[] args){
    int[][] arr = {
      {4, 3, 5, 6},
      {1, 5, 8, 2},
      {4, 7, 1, 0},
      {5, 1, 5, 8},
      {1, 8, 4, 2}};

    System.out.println("The original array is: ");
    for(int i = 0; i < arr.length; i ++){
      for(int k = 0; k <arr[0].length; k ++){
        System.out.print(arr[i][k]);
      }
      System.out.println();
    }

    for (int i = 0; i < arr.length; i++) {
      int temp;
      for (int k = 0; k < arr[i].length / 2; k++) {
        temp = arr[i][k];
        arr[i][k] = arr[i][arr[i].length - 1 - k];
        arr[i][arr[i].length - 1 - k] = temp;
      }
    }

    for (int i = 0; i < arr.length / 2; i++) {
      int[] temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    System.out.println("The 180 degree rotated array is: ");
    for(int i = 0; i < arr.length; i ++){
      for(int k = 0; k <arr[0].length; k ++){
        System.out.print(arr[i][k]);
      }
      System.out.println();
    }
  }


}
