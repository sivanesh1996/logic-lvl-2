class Char3
{
    public static void main(String[] args)
      {
        char arr[]={'K','L','M','N','O','P','Z','Y'};
        System.out.println("given array:");
        for(int i=0;i<arr.length;i++)
         {
           System.out.println(arr[i]);              //printing the given array
          }
        System.out.println("After skipping characters:even by 1 & odd by 2 ");
        for(int i=0;i<arr.length;i++)
          {
            int a=arr[i];
            
            if(a%2==0)
             {
              a=a+2;               // even characters to skip 1 character but the ans is 2nd character.So a+2
              if(a>90)
               {
                 a=a-26;            //like previous problem.after conversion if exceeds 90.
                }
               char c=(char)a;
               System.out.println(c);
              }

            else
              {
                a=a+3;              // odd characters to skip 2 character but the ans is 3rd character.So a+3
                if(a>90)
                 {
                  a=a-26;           //like previous problem.after conversion if exceeds 90.
                  }
                 char c=(char)a;
                 System.out.println(c);
                 
               }  
            }   
         }
}    


        



           
           
          
