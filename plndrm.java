import java.util.*;
class plndrm
{
 public static void main(String ar[])
 {
  Scanner sc=new Scanner(System.in);
  String s,s2,s1="";
  int i,n;
  //char ch;
  s=sc.nextLine();
  n=s.length();
  s2=s;

  for(i=n-1;i>=0;i--)
     {
     // ch=s.CharAt(i);
      s1=s1+s.charAt(i);
     }
   System.out.println("the entered string is: "+s);
   System.out.println("the reversed string is: "+s1);

   if(s1.equals(s2))
   {
    System.out.println("the string is palindrome");
    }
   else
   {
    System.out.println("the string is not palindrome");
   }
}
}
