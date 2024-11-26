import java.util.Scanner;
class Conversion
{
    public static void main (String[] args) 
    {
        System.out.println("Decimal to binary Conversion");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
          System.out.println("1.Enter for Decimal to binary ");
           choice = sc.nextInt();
           switch (choice) {
            case 1:
              String binary = sc.next();
              break;
            default:System.out.println("Invalid");
              break;
           }

        }while(choice != 2);{
          sc.close();

        }
    }
}