package array;


class sumAverage {
  public static void main(String[] args) {
    System.out.println("Welcome to Array sum and average: ");
    int[] numArray = classUtility.inputArray();
    long sum = sum(numArray);
    int avg = average(numArray);
    System.out.println("The sum of all elements of Array: " + sum);
    System.out.println("The average of the numbers : " +avg);
  


   
   

  
  }
  public static long sum(int[] numArray){
    long total= 0;
    int i = 0;
    while (i<numArray.length){
      total += numArray[i];
      i++;
    }
    

    return total;
  }


  public static int average(int[] numArray){
    long total = sum(numArray);
    return (int)(total/ numArray.length);
  }
}  
