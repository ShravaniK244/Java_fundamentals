package array;

public class IfSorted {
  public static void main(String[] args) {
    
    int [] arr = {12,3,42,23,32,78,10,46};
    boolean isSorted = true;
    
    for (int i = 0; i<arr.length-1;i++){
      if (arr[i]>arr[i+1]){
        isSorted = false;
        break;
      }
      
      
    
    }
    System.out.println("The array is sorted: " +isSorted);
  }
  
}