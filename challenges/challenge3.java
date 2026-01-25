

import java.util.Scanner;

public class challenge3 {
  public static void main(String[] args) {
    System.out.println("Enter the sides of rectangle");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the valueof  first side: ");
    int a = input.nextInt();

    System.out.print("Enter the valueof  second side: ");
    int b = input.nextInt();

    System.out.print("Enter the valueof  third side: ");
    int c = input.nextInt();

    System.out.print("Enter the valueof  fourth side: ");
    int d = input.nextInt();

    System.out.println(a+b+c+d);
    input.close();


  }
}
