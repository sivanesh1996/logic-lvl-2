class Char1
{
    public static void main(String[] args)
      {
        char arr[]={'A','B','C','Z','Y'};
        System.out.println("given array:");
        for(int i=0;i<arr.length;i++)
         {
           System.out.println(arr[i]);              //printing the given array
          }
        System.out.println("After adding characters:");
        for(int i=0;i<arr.length;i++)
          {
            int a=arr[i];
            a=a+2;
            
            if(a>90)
             {
               a=a-26;  // if i/p is Z ie.90 Ans is B ie.66.But here after conversion 90 becomes 92. So 92-66=26                    
             }
            char c=(char)a;
            System.out.println(c);
           }


        

}}

           
           
          
