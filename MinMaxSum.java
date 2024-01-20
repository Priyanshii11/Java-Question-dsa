public class MinMaxSum {
    public static void main(String[] args) {
        
        int Arr[] = {2,3,6,62,53};
        int min, max;
        max = Arr[0];
        min = Arr[0];
            for (int i = 0  ; i < Arr.length ; i++) {
                if (Arr[i] < min)
                    {
                    min = Arr[i];
                    }
                    if (Arr[i] > max)
                    {
                        max = Arr[i];   
                    }          
            }
             System.out.println(min);
             System.out.println(max);
             int SumOfminmax = sumOfminmax(min, max);
             System.out.println(SumOfminmax); 
             
             
    }

    private static int sumOfminmax(int min, int max) {
        return min + max;
    
    }
}



    

