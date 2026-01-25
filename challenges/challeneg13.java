

import java.util.Scanner;

public class challeneg13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    int reverse = reverseNum(num);
    System.out.println("Reverse of your number : " + reverse);
    input.close();
    
  }
  public static int reverseNum(int num){
    int newNum = 0;
    while(num > 0){
      int digit = num %10;
      newNum = newNum*10 + digit;
      num /= 10;


    }
    return newNum;

  }
  
  
  
}
