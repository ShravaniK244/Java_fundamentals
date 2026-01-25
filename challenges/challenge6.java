

import java.util.Scanner;

public class challenge6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number : ");
    int num = input.nextInt();
    for (int i =1; i<=10; i++){
      System.out.println(num + "x"+ i +"=" +(num*i));
    }
  input.close();
    
  }
  
  
}
