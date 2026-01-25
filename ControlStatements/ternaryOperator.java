package ControlStatements;

import java.util.Scanner;

public class ternaryOperator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to number checker");
    System.out.println("Please enter your first number");
    int num1 = input.nextInt();
    System.out.println("Now, Enter the second number: ");
    int num2 = input.nextInt();
    input.close();
    // int greterNumber;

    // if(num1>num2){
    //   greterNumber = num1;
    // }
    // else{
    //   greterNumber = num2;
    // }


  int greterNumber = num1>num2? num1 : num2;
  
  System.out.println(greterNumber+" is the greater number");

  }
}
