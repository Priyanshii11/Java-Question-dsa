import java.util.Scanner;

public class thirdLargest {

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Largest number Program");
    int arr[] = new int[4];
    int max =arr[0];
    System.out.print("Enter the values of array of lenght 4 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}