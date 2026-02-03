package Methods;

import java.util.Scanner;

public class square {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = input.nextInt();
    int c = SquareOfNumber(a);
    System.out.println("The Square of number: " + c);
    input.close();
  }
  static int SquareOfNumber(int a){
    int c = a*a;
    return c;

  }
  
}
