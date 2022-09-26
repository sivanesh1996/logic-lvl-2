import java.util.Scanner;

class Ip2d1
{
    public static void main(String[] args)
      {
       
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int r=sc.nextInt();
        System.out.println("Enter the number of column:");
        int c=sc.nextInt();
         int arr[][]=new int[r][c];
          System.out.println("Enter the"+r +"x" +c +"matrix one by one:");
       // System.out.println(arr[r].length);
        for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
              {
                arr[i][j]=sc.nextInt();
                }
           }

         for(i=0;i<r;i++)
          {
            for(j=0;j<c;j++)
           {
             System.out.print(arr[i][j] +" ");
            }
          System.out.println();
      }
}
}

