package array;

public class PositiveNumber {
  public static void main(String[] args) {
    int [] arr = {2,34,55,6,57,86,3};
    int count = 0;
    for (int i = 0;i<arr.length;i++){
      if (arr[i]>0){
        count = count +1;
        

      }
      
    }
    System.out.println("The positive numbers in an array is: " +count);
  }
  
}
