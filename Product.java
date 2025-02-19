import java.util.*;
class Product1
{
int pcode,price;
		String  pname; 
}
class Product
	{
	public static void main(String arg[])
		{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Product1 ob1=new Product1();
		Product1 ob2=new Product1();
		Product1  ob3=new Product1();
		System.out.println("Enter the first product code : ");
		ob1.pcode=sc.nextInt();
		System.out.println("Enter the first product name : ");
		ob1.pname=sc1.nextLine();
		System.out.println("Enter the first product price : ");
		ob1.price=sc.nextInt();
		System.out.println("Enter the second product code : ");
		ob2.pcode=sc.nextInt();
		System.out.println("Enter the  second product name : ");
		ob2.pname=sc1.nextLine();
		System.out.println("Enter the  second product price : ");
		ob2.price=sc.nextInt();
		System.out.println("Enter the third product code : ");
		ob3.pcode=sc.nextInt();
		System.out.println("Enter the  third product name : ");
		ob3.pname=sc1.nextLine();
		System.out.println("Enter the  third product price : ");
		ob3.price=sc.nextInt();
		
	if(ob1.price<ob2.price && ob1.price<ob3.price)
	{
		System.out.println(ob1.price+" is the product with lower price .");
	}
		else if(ob2.price<ob1.price && ob2.price<ob3.price)
		{
			System.out.println(ob2.price+" is the product with lower price .");
		}
			else
			{
				System.out.println(ob3.price+" is the product with lower price .");
			}
		}
	}
	
