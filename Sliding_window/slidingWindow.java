public class slidingWindow{

  public static int maxSum(int arr[] , int k) {
    int left = 0;
    int sum = 0 ;
    int maxSum = Integer.MIN_VALUE  ;


    for(int right = 0 ; right < arr.length ; right ++)
    {
      sum = sum + arr[right]; // this adds a new element


      if(right - left +1 == k)
      {
        
      }
    }

    return maxSum ;
  }
}