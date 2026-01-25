
import java.util.Scanner;

public class challenge9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int num = input.nextInt();
    int sum = SumOfDigits(num);
    System.out.println("Sum of Digits of " + num + " is:" + sum );
    input.close();

  }
  public static int SumOfDigits(int num){
    int sum = 0;
    while (num >0){
      
      sum = sum+ num % 10;
      num = num/10 ;
    
    }
    return sum;
  }
  
}
