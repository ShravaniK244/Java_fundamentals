package Methods;


import java.util.Scanner;

public class MaxNumber {
  public static void main(String[] args) {
    
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter first number: " );
  
  int a = input.nextInt();
  System.out.print("Enter second number: " );
  int b = input.nextInt();
  int c = MaxOfTwo(a,b);
  System.out.println("The maximum number: " + c);
  input.close();
}
static int MaxOfTwo(int a,int b){
  if (a>b){
    return a;
  }
  else{
    return b;
  }
 
}

  
}
