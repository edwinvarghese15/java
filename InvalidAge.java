import java.util.*;
class InvalidAgeException extends Exception
{
public InvalidAgeException(String m)
{
super(m);
}
}
static void age(int n) throws InvalidAgeException
{
if(n<18)
{
throw new Exception("Invalid Age");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in):
System.out.println("Enter any age:");
n=sc.nextInt();
try
{
age(m);
}
catch(InvalidAgeException e)
{
System.out.println(e);
}
}

