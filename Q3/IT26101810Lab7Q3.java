import java.util.Scanner;
public class IT26101810Lab7Q3{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		
		double amount,grandamount,discount;
		char mode;
		int i=1;
		
		while(i<=5)
		{
			
			System.out.println("Customer"+" "+i);
			
		    System.out.print("Enter total bill amount: ");
			amount=sc.nextInt();
			
			discount=(amount)*5/100;
			grandamount=(amount)-(discount);
			
			System.out.print("Enter mode of payment(C for cash,O for other): ");
			mode=sc.next().charAt(0);
			
			if(mode=='C'||mode=='c')
			{
				System.out.println("Discount is: "+ discount);
				System.out.println("Amount to be paid: "+ grandamount);
			}
			else if(mode=='O'||mode=='o')
			{
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: "+amount);
			}
			else
			{
				System.out.println("Payment Mode is Not Valid");
			}
			i=i+1;
			System.out.println();
		}
		
	}
}

			
	
			
		