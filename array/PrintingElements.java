package array;

public class PrintingElements {
  public static void main(String[] args) {
    int [] arr = {4,7,1,9};
    
    int count = 0;

    for (int i = 0 ;i<arr.length;i++){
      if(arr[i]%2 == 0){
        count = count +1;
      
      }
      

    }
    System.out.println("The Positive numbers in the array are: " + count);

  }
  
}
