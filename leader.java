import java.util.ArrayList;
import java.util.Scanner;

public class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Leader Number Program");
        int[] arr = new int[5];
        ArrayList<Integer> result = new ArrayList<>();

        // Input the array
        System.out.print("Enter the values of the array of length 5: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find leaders
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false; // Not a leader if a greater element exists on the right
                    break;
                }
            }
            if (isLeader) {
                result.add(arr[i]); // Add to result if it's a leader
            }
        }

        // Output the leaders
        System.out.println("Leaders in the array: " + result);
        sc.close();
    }
}
