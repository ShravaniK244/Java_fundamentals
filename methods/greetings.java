package Methods;

import java.util.Scanner;

public class greetings {
  public static void main(String[] args) {
    int first = readNumber();
    int second = readNumber();


    int sum = first + second;
    System.out.println("Sum of the number is: "+ sum);
   

    
  }
  public static int readNumber(){
     Scanner input = new Scanner(System.in);
     System.out.print("Please enter the number: ");
     int number = input.nextInt();
     input.close();
     return number;

    }

    
  
  
}
