class Avg
{
    public static void main(String[] args)
      {
        int arr[]={11,12,13,14,15,16,17,18,19,20};
        float sum=0;                        // initialize a variable with 0
        for(int i=0;i<arr.length;i++)    // condition 1<10 means upto 9 index
         {
           sum=sum+arr[i];              //store the value of array and add with previous value   
          }
        float n=sum/(arr.length);   //total sum/length   is average
        System.out.println(n);      
       }
}
