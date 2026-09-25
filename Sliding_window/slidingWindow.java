

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

        maxSum = Math.max(maxSum , sum);

        sum = sum + arr[left];
        left ++;
      }
    }


    return maxSum ;
  }

  public static void main(String[] args)
  {
    int[] arr = {2,3,1,5,6,2};
    int k = 3;

    int ians = maxSum(arr , k);


    System.out.println("Maximum sum is "+ ians);
  }
}