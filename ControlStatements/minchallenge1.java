package ControlStatements;

import java.util.Scanner;

public class minchallenge1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number :");
    int a = input.nextInt();
    System.out.print("Enter second number: ");
    int b = input.nextInt();
    input.close();

    int minNumber = a<=b? a:b;
    System.out.println(minNumber + " is minimum number");

    
  }

  
}
