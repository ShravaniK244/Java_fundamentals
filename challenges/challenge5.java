

import java.util.Scanner;

public class challenge5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Showcasing Bitwise and operator: ");
    System.out.print("Please enter first number: ");
    int first = input.nextInt();
    System.out.print("Enter the second number: ");
    int second = input.nextInt();
    int result  = first | second;
    System.out.println("Result: " + result);
    input.close();

  }
}
