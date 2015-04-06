public class Employee {

  private String name;
  private double balance;
  private double rate;

  public Employee(String name, double rate) {
    this.name = name;
    this.rate = rate;
    this.balance = 0;
  }

  public Employee(String name, double rate, double balance) {
    this.name = name;
    this.rate = rate;
    this.balance = balance;
  }

  public void spend(double money) {
    this.balance -= money;
  }

  public void work(int hours) {
    this.balance += this.rate * hours;
  }

  public void printinfo() {
    System.out.println(
        String.format(
          "Name: %s\nBalance: %s\nRate: %s",
          this.name,
          this.balance,
          this.rate
        )
    );
  }

  public static void main(String[] args) {
    Employee joe = new Employee("Joe", 8.5);
    Employee kate = new Employee("Kate", 10, 50);

    joe.printinfo();
    kate.printinfo();

    joe.work(8);
    kate.work(7);
    joe.spend(5);
    kate.spend(10);

    joe.printinfo();
    kate.printinfo();

  }
}
