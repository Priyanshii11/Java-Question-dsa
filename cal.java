import java.util.Scanner;

public class cal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num; 

    System.out.println("Welcome To the Calculator");
    System.out.println("Enter The Number ");
    int x = sc.nextInt();
    int y = sc.nextInt();

    do{
    System.out.println(".....Menu.......");
    System.out.println("1.Add");
    System.out.println("2.Subtract");
    System.out.println("3.Multiply");
    System.out.println("4.Division");
    System.out.println("5.Exit");
     num = sc.nextInt(); 

    switch (num) {
      case 1:
      System.out.println("ADD " + (x+y));
        break;
        case 2:
      System.out.println("Subtract "+ (x-y));
        break;
        case 3:
      System.out.println("Multiply "+ (x*y));
        break;
        case 4:
      System.out.println("Division "+ (x/y));
      System.out.println("Remainder " + (x%y));
      break;
      case 5:
      System.out.println("Exit");
      break;   
      default:
      System.out.println("Invalid");
        break;
    }
  }while(num != 5);{
    sc.close();
  }


  }
  
}
