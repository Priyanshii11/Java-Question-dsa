import java.util.Scanner;

public class RoArray {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lienar Search Program");
    int arr[] = new int[5];
    int temp[] = new int[5];
    int k = 0;
    
    System.out.print("Enter the values of array of lenght 5 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");

    }
    System.out.println();
    System.out.print("From where Array rotate -");
    int x = sc.nextInt();

    for(int i = x ; i<arr.length;i++){
      temp[k] = arr[i];
      k++;
    }
    for(int i = 0 ; i < x ;i++){
      temp[k]=arr[i];
      k++;
    }
    for(int i =0;i<temp.length;i++){
      System.out.print(temp[i]+" ");
    }


   }
}
