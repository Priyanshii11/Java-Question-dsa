import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DistictVal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Distict Value ");
    int arr[] = new int[5];    
    System.out.print("Enter the values of array of lenght 5 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");

    }
    Arrays.sort(arr);
    System.out.println();
      int idx = 1; // Start from the second element
        for (int i = 1; i < arr.length  ; i++) {
            if (arr[i] != arr[i - 1]) {
              arr[idx++] = arr[i]; 
            }
        }
        for(int i = 0 ; i<idx;i++){
          System.out.print(arr[i]+ " ");
        }
  }  
}
