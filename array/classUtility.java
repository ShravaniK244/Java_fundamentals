package array;

import java.util.Scanner;

public class classUtility {
  public static int[] inputArray() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number of elements in array: ");
    int n = input.nextInt();
    int[] nums = new int[n];
    int i =0;
    input.close();
    while (i< n){
      System.out.println("Please enter element number: " + (i+1) +" : ");
      nums[i]= input.nextInt();
      i++;

    }
    return nums;
   
  
  }
  
    
}
  

