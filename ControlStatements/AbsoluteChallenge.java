package ControlStatements;

import java.util.Scanner;

public class AbsoluteChallenge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number :");
    int num = input.nextInt();
    input.close();
    int result = num >= 0? num : -num;
    System.out.println("Absolute value is: " +result);
  }
  
}
