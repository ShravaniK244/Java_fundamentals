package array;

public class arrayDecrease {
  public static void main(String[] args) {
    int [] arr = {23,4,56,34,9,2,5,3};
    int count = 0;
    for (int i =0; i<arr.length;i++){
      if(arr[i]>arr[i+1]){
        count = count+1;
      }
    }
    System.out.println("The decrease count:" + count);
  }
  
}
