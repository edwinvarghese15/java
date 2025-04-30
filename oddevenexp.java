import java.util.*;
class Evenexception extends Exception{
    Evenexception(String s){
        super(s);
    }
}
    class oddevenexp{
         static void oddevenexp(int n) throws Evenexception
        {
            if(n%2==0){
                throw new Evenexception(n+ "Even number");
            }
            else{
                throw new Evenexception(n+ "odd number");
            }
        }
            public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
           
            try{
                System.out.println("Enter a number:");
                int n=sc.nextInt();
                oddevenexp(n);
            }
            catch(Evenexception e){
                System.out.println(e);
            }
            {

            }
        }


        }
    
