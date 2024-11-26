import java.util.ArrayList;

public class intersection {
  public static void main(String[] args) {

      System.out.println("Intersection of the Array");
      int arr[] = {1,3,4,6,3,1};
      int arr2[] = { 2 ,4,3,2,1,3,1,2,5,6,7,8,5,3};
      ArrayList<Integer> res = new ArrayList<>();
      for(int i =0;i<arr.length;i++){
      for(int j=0;j<arr2.length;j++){
        if(arr[i]==arr2[j]){  
          if(!res.contains(arr[i])){
          res.add(arr[i]);
        }
        }
     
        }
         
      }
      
      for(int num: res)
      System.out.print(num + " ");

    }
  
}
