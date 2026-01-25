

import java.util.Scanner;

public class Challenge10 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the number: ");
    int first = input.nextInt();
    System.out.println("Enter second number: ");
    int second = input.nextInt();
    int LCM = LCMcalculator(first, second);
    System.out.println("The LCM of " + first + " and "+ second + " is " + LCM); 
    input.close();
    
  }
  public static int LCMcalculator(int first, int second){
    int i = 1;
    while (i<= second){
      int factor = first * i;
      if(factor %second == 0){
        return factor;

      }
      i++;
    }
    return 0;

    
  }
  
}
