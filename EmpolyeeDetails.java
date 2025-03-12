import java.util.*;
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee id:"+id+"Employee name"+name+"Employee Salary"+salary);
    }

}

 class EmpolyeeDetails {
    public static void main(String[] args) {
        int n,en,search,flag=0;
		String nam;
		double s;
        Scanner s1= new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.print("Enter the total number of employees:");
		n=s1.nextInt();
		Employee[] obj=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter the "+(i+1)+" employee id: ");
			en=s1.nextInt();
			System.out.print("Enter the "+(i+1)+" employee name: ");
			nam=s2.nextLine();
			System.out.print("Enter the "+(i+1)+" salary of employee: ");
			s=s1.nextDouble();
			obj[i]=new Employee(en,nam,s);
		}
		System.out.print("\nEnter the employee id to be searched:");
		search=s1.nextInt();
		for(int i=0;i<n;i++)
		{
			if(search==obj[i].id)
			{
				flag=1;
                System.out.println("Employee found..");
                System.out.println("Employee id:"+obj[i].id);
                System.out.println("Employee Name:"+obj[i].name);
                System.out.println("Employee Salary:"+obj[i].salary);
				break;
			}
		}
		if(flag==1)
		{
			
		}
		else
		{
			System.out.println("Employee not found..");
		}
	}
}



