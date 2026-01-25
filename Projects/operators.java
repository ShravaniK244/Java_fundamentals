package Projects;
//Intrest calculator

public class operators {
  public static void main(String[] args) {
    System.out.println("Welcome to Simple Interest Calculator ");
    int principal = 20;
    double rate = 7.4;
    int time = 60;
    double si;
    si = (double) (principal * time * rate) / 100;
    System.out.println("The simple interest is: " +si);
  }
  
}
