class Employee{

  private int acbalance;
  private int rate;
  private String empname;

  public static void main(String[] args){
    //this should be in a different file so they understand the class can be in a different file
    System.out.println("creating employees");
    Employee em1 = new Employee("Bob", 3000, 50);
    Employee em2 = new Employee("Rob", 1000, 20);
    Employee em3 = new Employee("Tom", 10);

    em1.printinfo();
    em2.printinfo();
    em3.printinfo();

    System.out.println("working employees a few hours");

    em1.work(10);
    em2.work(20);
    em3.work(30);

    em1.printinfo();
    em2.printinfo();
    em3.printinfo();

    System.out.println("All done, going home!");
  }

  public Employee(String name, int balance, int hourly){
    empname = name;
    rate = hourly;
    acbalance = balance;
  }

  public Employee (String name, int hourly){
    empname = name;
    rate = hourly;
    acbalance = 0;
  }

  public void work(int hours){
    acbalance += rate*hours;
  }

  public void spend(int mon){
    acbalance -= mon;
  }

  public void printinfo(){
    System.out.println("Employee name is " + empname);
    System.out.println("Employee rate is " + rate);
    System.out.println("Employee balance is " + acbalance);
    System.out.println();
  }

}
