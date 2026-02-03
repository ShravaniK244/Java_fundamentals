package Methods;

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    String ans = Checking(a);
    input.close();
    System.out.println("The number is: " +ans);
    
  }
  static String Checking(int a){
    if(a%2 == 0){
      return "Even";
    }
    else{
      return "Odd";
    }

  }
  
}
