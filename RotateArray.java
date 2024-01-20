public class RotateArray {
    public static void main(String[] args) {
        
        int Arr[] = {2,3,6,62,53,65,3,8};
        int length = Arr.length;
        int index = 3;

        int temp[] = new int[length];
        int k = 0;


        for(int i =index ; i < length; i++){
            temp[k] = Arr[i];
            k++;
        }
        for (int i = 0; i < index; i++) {
        temp[k] = Arr[i];
        k++; 
        }
        for (int i = 0; i < length;i++) {
            Arr[i] = temp[i];
            System.out.print(Arr[i]+" ");

        }  
    }
       
    } 

