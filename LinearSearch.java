import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lienar Search Program");
    int arr[] = new int[4];
    System.out.print("Enter the values of array of lenght 4 :- ");
    for(int i = 0 ; i<arr.length;i++){
       arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("Enter the number you want to find");
    int x = sc.nextInt();
    for(int i = 0;i<arr.length;i++){
      if(arr[i]==x){
        System.out.println("ELement found at " +i);
      }
      }
    }
  }
  

