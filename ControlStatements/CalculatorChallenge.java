package ControlStatements;

import java.util.Scanner;

public class CalculatorChallenge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number :");
    int a = input.nextInt();
    System.out.print("Enter second number: ");
    int b = input.nextInt();
    
    System.out.println("Enter the number 1 for +, 2 for -, 3 for *, 4 for /");
    int n = input.nextInt();
    switch(n){
      case 1 -> System.out.println("The addition of two numbers: " + a+b);
      case 2 -> System.out.println("The subtraction of two numbers: " + (a-b));
      case 3 -> System.out.println("The multiplication of two numbers: " + a*b);
      case 4 -> System.out.println("The division of two numbers: " + a/b);
      default -> System.out.println("Invalid Operator");

    };
    input.close();
  }
}
