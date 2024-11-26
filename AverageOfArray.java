import java.util.Scanner;

public class AverageOfArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float sum =0;
    System.out.print("Enter the length of array: ");
    int number =sc.nextInt();
    System.out.print("Enter the Array elements: ");
    int arr[] = new int[number];
    for (int i = 0; i<number;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
    }
    System.out.println("Sum of all the Array is = "+sum);
    double avgArray = sum/number;
    System.out.println(avgArray);
  }
  
}
