package array;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = {23,4,22,56,35,45,23,13,2,8};

    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}

