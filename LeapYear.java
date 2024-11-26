import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    System.out.println(".......Leap Year Program......");
    Scanner sc = new Scanner(System.in);
    int number;
    number = sc.nextInt();
    if(number % 4 == 0){
      if( number %100 == 0){
        if(number % 400 == 0){
          System.out.println("Leap Year");
        }else{
          System.out.println("Not a year");
        }
      }else{
        System.out.println("not a Leap Year");
      }
    }else{
      System.out.println("not a leap year");
    }
    sc.close();
  
  }

   
}
