public class Square {
  // josh@jmatthews.us
  
  private int size;

  public Square(int size) {
    this.size = size;
  }

  public int getSize() {
    return this.size;
  }

  public static void main(String[] args) {
    System.out.print("Enter size for square 1: ");
    Square sq1 = new Square(IO.readInt());

    System.out.print("Enter size for square 2: ");
    Square sq2 = new Square(IO.readInt());

    System.err.println("Square 1 has size " + sq1.getSize());
    System.err.println("Square 2 has size " + sq2.getSize());
  }
}
