package array;

public class SmallestNumber {
  public static void main(String[] args) {
    int [] arr = {12,3,42,23,32,78,10,46};
    int smallest = arr[0];
    for (int i = 0; i<arr.length;i++){
      if(arr[i]<smallest){
        smallest = arr[i];
      }
    
    }
    System.out.println("Smallest number in an array is: " +smallest);
  }
  
}
