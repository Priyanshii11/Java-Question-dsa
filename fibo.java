import java.util.Scanner;

public class fibo {
  public static void main(String[] args) {
    System.out.println(".....Program of Fibonacci Series.......");
    System.out.print("Enter the number to print till ");
    Scanner scanner = new Scanner(System.in);
    int number;
     number = scanner.nextInt();
    int fibo[] = new int[number+1];
    fibo[0] =0 ; fibo[1]=1;
    int  sum =fibo[0]+fibo[1];

    for(int i = 2;i<=number;i++){
      fibo[i] = fibo[i-1]+fibo[i-2];
      sum += fibo[i];
      System.out.println(fibo);
    }  
    System.out.println("Lastly sum of fibonacci series is : "+sum);
    
  }

  
}
