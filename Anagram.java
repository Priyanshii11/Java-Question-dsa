import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        char str[] = {'r','a','c','e'};
        char str2[] = {'c','a','r','D'};

        int n1 = str.length;
        int n2 = str2.length;

        if (n1 != n2) {
            System.out.println("Length of the strings are not equal.");

    }else if (n1 == n2 ) {
        areAnagrams(str, str2);
        
    }
    else{
        System.out.println("error");
    }
}
 static boolean areAnagrams(char[] str, char[] str2) {
    Arrays.sort(str);
    Arrays.sort(str2);
    for (int i = 0; i < str.length; i++) {
        if(str[i] == str2[i]){
            return true;
       } 
          
    }
    return false;
}

   
}
