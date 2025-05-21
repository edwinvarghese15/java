import java.util.Scanner*;
class Multiplication extends Thread
{
public void run()
{
System.out.println("Multiplication table of 5:");
for(int i=1;i<=10;i++)
{
System.out.println(i*"5="+i*5:);
{
System.out.println("Existing from Thread Multiplication..");
}
}
class PrimeNumbers extends Thread 
{
private int n;
public PrimeNumbers(int n)
{
this.n=n;
}
public void run()
{
prime_N(n);
}
static void prime_N(int n)
{
int x,y,flag;
System.out.println("All the Prime numbers within 1 and"+N+"are:");
for(x=1;x<=N;x++)
{
if(x==1||x++0)
{
continue;
}
flag=0;
break;
}
}
if(flag==1)
{
System.out.println(x+"\t");
}
}
System.out.println();
}
}
public class ThreadClass
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the value of n for prime numbers:");
int n=scanner.nextInt();
Multiplication multiplicationThread=new Multiplication();
PrimeNumbers primeNumbersThread=new PrimeNumbers(n);
primeNumbersThread.start();
multiplicationThread.start();
scanner.close();
}
}




public class ThreadClass
{
public static void main(String args{})
