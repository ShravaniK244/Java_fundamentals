package array;

public class SecondLargest {
  public static void main(String[] args) {
    int arr[] = {2,34,56,57,34,2,25};
    int largest = arr[0];
    int second =  Integer.MIN_VALUE;
    for (int i = 0; i<arr.length;i++){
      
      if (arr[i]>largest){
         
         second = largest;
        largest = arr[i];
      }
      else if(arr[i] > second && arr[i] != largest){
        second = arr[i];
      }
    
    }
    System.out.println("The second largest number:  " +second);
  }
  
}
