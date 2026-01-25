

import java.util.Scanner;

public class challenge2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    float a = input.nextFloat();
    System.out.print("Enter second number: ");
    float b = input.nextFloat();
    System.out.println("Result" +(a*b));
    input.close();
  }
  
}
