import java.util.Arrays;
import java.util.Scanner;

public class ScndLargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Second Largest number Program");
    int arr[] = new int[4];
    int max =arr[0];
    System.out.print("Enter the values of array of lenght 4 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    Arrays.sort(arr);

    int value = arr[0];
    for(int i = arr.length-2; i>=0 ; i--){
      if(arr[i] != arr[arr.length -1]){
        value = arr[i];
      }
      System.out.println(value);
    }
  }
}
