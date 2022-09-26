/*
import java.util.Scanner;

class Ip2d
{
    public static void main(String[] args)
      {
        int arr[][]=new int[3][3];
         int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of 3x3 matrix one by one");
       
        for(i=0;i<arr.length;i++)
          {
            for(j=0;j<arr.length;j++)
              {
                arr[i][j]=sc.nextInt();
                }
           }

         for(i=0;i<arr.length;i++)
          {
            for(j=0;j<arr.length;j++)
           {
             System.out.print(arr[i][j] +" ");
            }
          System.out.println();
      }
}
}
*/

import java.util.Scanner;

class Ip2d
{
    public static void main(String[] args)
      {
        int arr[][]=new int[3][3];
         int i=0;
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of 3x3 matrix one by one");
       
        for(;i<arr.length;i++)
          {
            for(;j<arr.length;j++)
              {
                arr[i][j]=sc.nextInt();
                }
           }

         for(i=0;i<arr.length;i++)
          {
            for(j=0;j<arr.length;j++)
           {
             System.out.print(arr[i][j] +" ");
            }
          System.out.println();
      }
}
}

