package Methods;



public class countPositive {
  public static void main(String[] args) {
   int [] arr = {23,5,6,5,-24,26,-76};
   int total = PositiveNumber(arr);
   System.out.println("The total positive numbers are: "+ total);
    
  }

  static int PositiveNumber(int[] arr){
    int count = 0;
    for (int i =0; i<arr.length;i++){
      if(arr[i]>0){
        count = count+1;

      }

    }
    return count;
  }
  
}
