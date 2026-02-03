package array;

public class LargestNumber {
  public static void main(String[] args) {
    int [] arr = {12,3,42,23,32,78,10,46};
    int largest = arr[0];
    for (int i = 0; i<arr.length;i++){
      if(arr[i]>largest){
        largest = arr[i];
      }
    
    }
    System.out.println("Largest number in an array is: " +largest);
  }
  
}
