
import java.util.Scanner;

public class challenge12 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    boolean prime = CheckPrime(num);
    if (prime){
      System.out.println("Your Number is Prime ");
    }
    else{
      System.out.println("Your number is not prime");
    }
    input.close();

  }
  public static boolean CheckPrime(int num){
    int n = 2;
    while (n < num){
      if (num%n == 0){
        return false;
      }
      n++;

    }
    return true;
    

  }
  
}
