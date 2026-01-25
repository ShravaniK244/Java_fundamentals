

import java.util.Scanner;

public class Challenge8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int fact = input.nextInt();
    int factorial = Factorial(fact);
    System.out.println("The factorial of " + fact+ " is "+ factorial);
    input.close();
    
  }
  public static int Factorial(int fact){
    int result = 1;
    int i = 1;
    while (i<= fact){
      result = result * i;
      i++;

    }

    return result;
  }
  
}
