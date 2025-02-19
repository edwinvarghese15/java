import java.util.*;
public class Symm
	{
		public static void main(String arg[])
			{
			int i,j,row,col;
			int a[][]=new int[10][10];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of rows: ");
			row=sc.nextInt();
			System.out.println("Enter the number of columns: ");
			col=sc.nextInt();
			System.out.println("Enter the elements of the matrix .....");
			for(i=0;i<row;i++)
				{
				for( j=0;j<col;j++)
					{
						a[i][j]=sc.nextInt();
					}
				}
				System.out.println("The matrix elements are :");	
				for(i=0;i<row;i++)
				{
				for(j=0;j<col;j++)
					{
						System.out.print(a[i][j]+" ");
					}
				System.out.println(" ");
				}
				boolean isSym=true;
					for(i=0;i<row;i++)
					{
					for(j=0;j<col;j++)
						{
							if(a[i][j]!=a[j][i])
							{
							isSym=false;
							break;
							}
						}
					}
				if(!isSym)
				{
						System.out.println(" Not a Symmetric matrix .");
				}
				else
				{
					System.out.println("  Symmetric matrix .");
				}
				
			}
	}
