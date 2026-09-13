import java.util.Scanner;

public class IT26101810Lab7Q1A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
		
        int mark1 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        int mark2 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 3: ");
        int mark3 = sc.nextInt();
        
        System.out.print("Enter Subject Mark 4: ");
        int mark4 = sc.nextInt();
        
        double total = mark1 + mark2 + mark3 + mark4;
        double average = total / 4.0;
        
        System.out.println();
        System.out.println("Average is: " + average);
        
        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade is: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Overall Grade is: Fail");
        } else {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
        }
        
        sc.close();
    }
}