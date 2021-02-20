package Program;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0 and 1 are not prime number
		//for given number use for loop start from 2 till num/2
		//inside loop check if num modules is zero for any number
		//if yes break the loop , means number is not a prime
		//last check for flag if its still zero then its prime number
		
		int num=91;
		int flag =0;
		if(num<1)
		{
			System.out.println("not a prime number");
		}
		else 
		{
		   for(int i=2;i<=num/2;i++)
		   {      
			    if(num%i==0)
			    {      
			     System.out.println(num+" is not prime number");
			      flag++;
			      break;
			    }   
		   }
		}
		if(flag==0)
		{
			System.out.println(num+" is prime number");
		}
	}
}