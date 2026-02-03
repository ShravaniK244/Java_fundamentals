
import java.util.Scanner;

public class challeneg1 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int a = input.nextInt();
      System.out.print("Enter the second number: ");
      int b = input.nextInt();
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a/b);
      System.out.println(a%b);

  input.close();


  }
  
}
