import java.util.Scanner;
public class insurancetest {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner =new Scanner(System.in);
			System.out.println("Please enter your age, weight,and income");
			int age = scanner.nextInt();
			int weight =scanner.nextInt();
			int income =scanner.nextInt();
		
		
			if (age<18)
	        {
	        	System.out.println("Minor");
	        	
	        }
		
		
			 else if ((age>18 & age>38)&&weight<200)
					
		        {
		        	System.out.println("Healthy");
		        	
		        }
			
			 else if ((age>38 & age>58)&&income>50000)
					
		        {
		        	System.out.println("Low Risk");
		        	
		        }
			 else if ( age>58)
					
		        {
		        	System.out.println("High Risk");
		}
			
			
			
			
			
			
			
			
			
			
			
			
}}
