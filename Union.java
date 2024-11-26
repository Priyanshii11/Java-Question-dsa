import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
      System.out.println("Union of the Array");
      int arr[] = {1,2,3,4,6,3,2,1};
      int arr2[] = { 2 ,4,3,2,1,3,1,2,5,6};
      ArrayList<Integer> res = new ArrayList<>();
      for(int i : arr){
        if(!res.contains(i)){
          res.add(i);
        }
      }
      for(int i : arr2){
        if(!res.contains(i)){
          res.add(i);
        }
      }
      for(int num: res)
      System.out.print(num + " ");

    }
  
}
