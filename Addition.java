import java.util.*;
class Addition
{
public static void main(String args[])
{
int a[][]=new int[20][20];
int b[][]=new int[20][20];
int c[][]=new int[20][20];
int i,j;
int r1,c1,r2,c2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter row for first matrix:");
r1=sc.nextInt();
System.out.println("Enter column for the first matrix:");
c1=sc.nextInt();
System.out.println("Enter elements for the first matrix:");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
a[i][j]=Sc.nextInt();
}
}
System.out.println("Enter row for second matrix:");
r2=Sc.nextInt(();
System.out.println("Enter column for second matrix:");
for(int i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
a[i][j]=Sc.nextInt();
}
}
System.out.println("Matrix addition");
for(int i=0;i<r2;i++)
{
for(int j=0;j<c2;j++)
{
System.out.println(c[i][j]+"");
}
}
System.out.println();
}
}





