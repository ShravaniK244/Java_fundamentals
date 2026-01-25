package ControlStatements;

import java.util.Scanner;

public class evenOddChallenge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Even Odd Calculator");
    System.out.print("Enter a number :");
    int a = input.nextInt();
    input.close();
    String EvenOdd = a%2 == 0? "Even" : "Odd";

    System.out.println("The number " + a + " is: " +EvenOdd);
  }
  
}
