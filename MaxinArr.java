public class MaxinArr {

  public static void main(String[] args) {

     int num[] = new int[]{1,3,4,5};
     int maaxi = num[0];
    for(int i = 1 ; i<=num.length;i++){
      if(num[i]>num[i-1]){
        maaxi = num[i];
        System.out.println(maaxi);
      }else{
        maaxi = num[i-1];
      }

    }

  }
  
}
