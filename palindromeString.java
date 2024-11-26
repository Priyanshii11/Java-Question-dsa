import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class palindromeString {

  public static void main(String[] args) {
    String temp = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Strings :");
    String string = sc.next().toLowerCase();
    

    char[] arr = string.toCharArray();
    for(int i = arr.length-1; i>=0;i--){
      temp += arr[i];

    }System.out.println(temp);
    if(string.equals(temp)){
      System.out.println("Palindrome String");
    }else{
      System.out.println("Not a Palindrome");
    }


   

  }
  
}
