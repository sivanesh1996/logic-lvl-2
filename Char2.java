class Char2
{
    public static void main(String[] args)
      {
        char arr[]={'1','2','3','4','5'};

        for(int i=0;i<arr.length;i++)
         {
           int a=arr[i];     //storing ASCII number in int a
           a=a+1;            //ASCII of '1' is 49 and '2' is 50.So adding by 1
           char c=(char)a;   //Converting integer to ASCII
           System.out.print(c +" ");
        }

      }
}
