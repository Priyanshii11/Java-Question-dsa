import java.util.Scanner;

/**
 * SumOfNum sum of all the n natural number
 */
public class SumOfNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the for N natural Number");
    int num, sum=0;
    num = sc.nextInt();
    for(int i = 0; i<=num;i++){
      sum += i;
    }System.out.println("Sum of n number is: "+ sum);
  }

  
}