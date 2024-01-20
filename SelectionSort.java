//selection sorting algorithm 
public class SelectionSort {
    public static void main(String[] args) {
       int min_index;
    int arr[] = new int[]{2,4,5,1,8};
    System.out.println("elements Before sorting ");
    for (int i = 0; i < arr.length; i++){
        int v = arr[i];
        System.out.print(v);
    }
    System.out.println();

        //alogrithm of selection sort
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
        min_index = i;  
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }  // Swap current index with minimum element in rest of list
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
        System.out.print(arr[i]);
    }  
 }   
}
    

