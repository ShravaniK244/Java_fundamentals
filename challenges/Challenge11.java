

import java.util.Scanner;

public class Challenge11 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the number: ");
    int first = input.nextInt();
    System.out.println("Enter second number: ");
    int second = input.nextInt();
    int GCD = GCDcalculator(first, second);
    System.out.println("The LCM of " + first + " and "+ second + " is " + GCD); 
    input.close();
  }
  public static int GCDcalculator(int first , int second){
    int gcd = 1;
    int i = 2;
    int least =  least(first, second);
    while (i<= least){
      if (first % 1==0 && second% i==0){
        gcd = 1;
      }
      i++;
    }
    return gcd;

  }
  public static int least(int first, int second){
    if (first<second){
      return second;
    }
    else{
      return first;
    }
  }
  
}
