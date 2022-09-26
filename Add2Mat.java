import java.util.Scanner;
class Add2Mat
{
  public static void main(String[] args)
      {
       
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of Matrix A and B:");
        System.out.println("Enter the number of row:");
        int r=sc.nextInt();                                 
        System.out.println("Enter the number of column:");
        int c=sc.nextInt();
         int arr[][]=new int[r][c];
          System.out.println("Enter the "+r +"x" +c +" of matrix A one by one:");
       // System.out.println(arr[r].length);
        for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
              {
                arr[i][j]=sc.nextInt();
                }
           }
//        System.out.println("Matrix A:");
//
//         for(i=0;i<r;i++)
//          {
//            for(j=0;j<c;j++)
//           {
//             System.out.print(arr[i][j] +" ");
//            }
//          System.out.println();
//      }

      int arr1[][]=new int[r][c];
      System.out.println("Enter the "+r +"x" +c +" of matrix B one by one:");
       for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
              {
                arr1[i][j]=sc.nextInt();
                }
           }
//         System.out.println("Matrix B:");
//         for(i=0;i<r;i++)
//          {
//            for(j=0;j<c;j++)
//           {
//             System.out.print(arr1[i][j] +" ");
//            }
//          System.out.println();
//      }

       System.out.println("Matrix A:");

         for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
           {
             System.out.print(arr[i][j] +" ");
            }
          System.out.println();
      }

     System.out.println("Matrix B:");
         for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
           {
             System.out.print(arr1[i][j] +" ");
            }
          System.out.println();
      }
      
      System.out.println("Addition matrix C is :");
      int arr2[][]=new int[r][c];
        for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
           {
             arr2[i][j]=arr1[i][j]+arr[i][j];
             System.out.print(arr2[i][j] +" ");
            }
          System.out.println();
      }
     
}
}
