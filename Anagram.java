import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 , str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the words ");
         str1  = sc.next();
        str2 = sc.next();

        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 == n2) {
            System.out.println("Length of the strings are equal ie " + n2+"   " + n1);
            char arr[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr, arr2);
               if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are equal but not anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " length are not equals.");
        }
           
        }

       
            }
//  static void areAnagrams(String str1, String str2) {
//     Arrays.sort(str1);
//     Arrays.sor t(str2);
//     for (int i = 0; i < str1.length; i++) {
//         if(str1[i] == str2[i]){
//             System.out.println("Anagram");
//        } else{
//         System.out.println("Not Anagram");
//        }
          
//     }
// }
// }
