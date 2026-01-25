package ClassAndObject;

import java.util.Scanner;

public class Recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Factorial Generator");
    System.out.print("please enter number : ");
    int num = input.nextInt();
    long fact = factorial(num);
    System.out.println("Function called for:"  + fact);

    System.out.println("Factorial of your number: "  + fact);
    input.close();
  }
  public static long factorial(int num){
    if (num == 1){
      return 1;
    }
    return num *factorial(num-1);

  }


  public static long factorialIterative(int num){
    long result = 1;
    for (int i = 1; i <= num; i++){
      result *= i;

    }
    return result;

  }
}
