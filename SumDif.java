class SumDif
{
    public static void main(String[] args)
      {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++)    // condition 1<10 means upto 9 index
         {
           if(arr[i]%2==0)               // a[i] contains an int value
             {
              sum1=sum1+arr[i];          //store and add even literals
             }
           else
             {
              sum2=sum2+arr[i];          //store and add odd literals
            }
          }
        System.out.println("The sum of even literals:"+sum1);
        System.out.println("The sum of odd literals:"+sum2);
        System.out.println("The difference between even sum and odd sum is:"+(sum1-sum2));
       }
}
