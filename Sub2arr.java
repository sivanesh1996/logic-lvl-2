class Sub2arr
{
 public static void main(String[] args)
   {
     int arr[]={3,2,1};
     int arr1[]={3,2,1};
     int arr2[]=new int[arr.length];

     for(int i=0;i<arr.length;i++)
      {
       arr2[i]=arr[i]-arr1[i];
       System.out.print(arr2[i] +" ");
      }
    }
}
