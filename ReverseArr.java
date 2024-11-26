import java.util.Scanner;
public class ReverseArr {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Array in Reverse Program");
    int arr[] = new int[4];
    System.out.print("Enter the values of array of lenght 4 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for(int i = arr.length-1; i>=0;i-- ){
      System.out.print(arr[i] + " ");
    }

  }
}

