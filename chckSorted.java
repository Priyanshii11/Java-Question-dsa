import java.util.Scanner;

public class chckSorted {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Check if Array is sorted or not Program");
    int arr[] = new int[4];
    System.out.print("Enter the values of array of lenght 4 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    
        boolean isSorted = true; // Assume the array is sorted initially
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) { // Unsorted pair found
                isSorted = false;
                break;
            }
        }

        // Final result
        if (isSorted) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
  
}

