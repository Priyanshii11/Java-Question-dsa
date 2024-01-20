import java.util.Arrays;
public class BubleSort {
    public static void main(String[] args) {
     int arr[] = new int[]{2,4,5,1,8};
     System.out.println("elements Before sorting ");
     for (int i = 0; i < arr.length; i++){
         int v = arr[i];
         System.out.print(v);
     }
     System.out.println();
     System.out.println("after sorting");
     bubblesort(arr); 
    }
    public static void bubblesort(int [] arr) {
     int temp;
     for(int i = 0; i <arr.length; i++)    
     {    
        for(int j=0; j<arr.length-1; j++) {            
            if(arr[j] > arr[j + 1]) {
                 temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp; 
            } 
        }
    }
    System.out.println(Arrays.toString(arr));     
}
}
     
    
    

