import java.util.*;
class Large{
public static void main(String args[])
{
int a,b,c;
System.out.println("enter the largest number");
Scanner S=new Scanner(System.in);
a=S.nextInt();
b=S.nextInt();
c=S.nextInt();
if(a>b)
{
System.out.println("largest is"+a);
}
else if(b>c)
{
System.out.println("largest is"+b);
}
else
{
System.out.println("largest is"+c);
}
}
}
