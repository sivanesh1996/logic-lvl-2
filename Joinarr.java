class Joinarr
{
  public static void main(String[] args)
    {
      int arr[]={7,5,3};
      int arr1[]={4,6,7};
      int a=arr.length+arr1.length;
      int arr2[]=new int[a];
      
      for(int i=0;i<arr2.length;i++)
       {
         if(i<3)
         {
         arr2[i]=arr[i];
         //System.out.print(arr2[i]);
         }

         else
          {
           arr2[i]=arr1[i-arr.length];
           //System.out.print(arr2[i]);
           }
          System.out.print(arr2[i]);
       }
    }
}
