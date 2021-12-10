import java.util.*;
class Pattern2
{
  public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int alphabet=sc.nextInt();
   for(int i=0;i<=4;i++)
   {
     for(int j=0;j<=i;j++)
    {
    System.out.print((char)(alphabet+j)+" ");
   }
  System.out.println();
   }
} 
}
OUTPUT:
C:\vyshu>javac Pattern2.java

C:\vyshu>java Pattern2
65
A
A B
A B C
A B C D
A B C D E
             PROGRAM---3
import java.util.*;
class Vyshu1
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<=n;i++)
    {
     for(int j=0;j<=i;j++)
     {
    System.out.print("*"+" ");
    }
  System.out.println();
  }
  }
 }
OUTPUT:
C:\vyshu>javac Vyshu1.java

C:\vyshu>java Vyshu1
5
*
* *
* * *
* * * *
* * * * *
* * * * * *
