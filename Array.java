import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
  System.out.println(".......Array Program......");
    Scanner sc = new Scanner(System.in);
    int choice ,number;

    
    do{
      System.out.println("\n Menu");
      System.out.println("1.Insertion");
      System.out.println("2.Delete");
      System.out.println("3.Search");
      System.out.println("4.Update");
      System.out.println("6.Exit");
      System.out.print("What task you want to do?? ");
      choice = sc.nextInt();
      System.out.println();

    switch (choice) {
    case 1:
    //insertion
    System.out.println("Insertion of Array Program");
    System.out.print("Enter the size of Array  ");
     number = sc.nextInt();
    System.out.print("Enter "+number+" Element = ");
    int arr[] = new int[number];
    for(int i = 0; i< number ; i++){
        arr[i]=sc.nextInt();
      }
      //display
      System.out.print("ARRAY LIST = ");
      for(int i = 0;i<number;i++){
         System.out.print(arr[i]+ " ");
      }          
      break;
      case 2:
      //deletion
      break;
      case 3:
      //search
      System.out.println("Enter the number you want to search");
      int searchNum=sc.nextInt();
      for(int i =0 ; i < arr.length; i++){
        if (searchNum ==arr[i]) {
          System.out.println("Element found at " +i);
          break;
        }else{
          System.out.println("Element not found ");
        }
      }
      break;
      case 4:
      //deletion
      break;
      case 5:
      //Exit 
      System.out.println("Exit from Program");
      break;
      default:
      System.out.println("Invalid Choice");
      break;
      }
    }while(choice != 5 );{
      sc.close();
    }

    

      //search
      // System.out.println ("Enter Number You want to Search");
      // int searchNum = sc.nextInt();
      //   for(int i = 0 ; i <arr.length;i++){
      //   if (searchNum == arr[i]) {
      //     System.out.println("Number Found at " + i);
      //     break;
          
      //   }
      //   if(searchNum !=arr[i]){
      //     System.out.println("Number not found");
      //   }
      // }
      }

  }
