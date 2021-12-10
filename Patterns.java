import java.util.*;
class Patterns
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<=n;i++)
   {
    for(int j=0;j<=i;j++)
     {
     System.out.print(j+" ");
    }
   System.out.println();
   }
  }
}
OUTPUT:
C:\vyshu>javac Patterns.java

C:\vyshu>java Patterns
5
0
0 1
0 1 2
0 1 2 3
0 1 2 3 4
0 1 2 3 4 5
