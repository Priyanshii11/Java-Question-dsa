import java.util.Scanner;

public class MakeZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lienar Search Program");
    int arr[] = new int[5];
    int temp[] = new int[5];
    int k = 0;
    
    for(int i = 0 ; i<arr.length;i++){
      System.out.print("Enter the "+(i+1) + " value  = ");
      arr[i] = sc.nextInt();
    }
    for(int i = 0 ; i<arr.length;i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
    System.out.println("After make all zero to the end of the array");
    for(int i = 0 ; i<arr.length;i++){
      if(arr[i] != 0){
        temp[k++] = arr[i];
      }

    }
        
    while(k < arr.length){
      temp[k++] = 0;
    }
    
    for(int i = 0; i < arr.length;i++){
        arr[i] = temp[i];
        System.out.print(arr[i] + " ");
    }
  }
  
}
