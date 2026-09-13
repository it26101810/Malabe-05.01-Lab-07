import java.util.Scanner;
public class  IT26101810Lab7Q1B{
	public static void main(String[]args){
		
	Scanner sc = new Scanner(System.in);
	double marks[]=new double[5];
	double total,average;
	String Grade;
	int i =1;
	while(i<=3)
	{
		System.out.println("Student "+i);
		
		System.out.print("Enter marks:");
        for(int j=0;j<4;j++)
		{
			marks[j]=sc.nextDouble();
		}
		total=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		average=total/4;
		System.out.println("Average is: "+average);
		
		if(average<=100 && 75<=average)
		{
			System.out.println("Overall Grade is: Distinction");
		}
		else if(average<=74 && 50<=average)
		{
			System.out.println("Overall Grade is: Credit");
		}
		else
		{
			System.out.println("Overall Grade is: Fail");
		}
		i=i+1;
		System.out.println();
	}
	}
}