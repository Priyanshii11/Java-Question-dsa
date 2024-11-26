import java.util.Scanner;

public class Table {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Write which table you want to Print");
    int i = sc.nextInt();
    if(i != 0){
      for(int x=1;x<=10;x++){
      System.out.println(i + " x " +x+" = " +(x*i));
    }
    }
    else{
      System.out.println("Invalid Table");
    }
  }
  }

