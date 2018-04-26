
public class insurance {

	
	int age;
	int weight;
	double income;
	
	public insurance(int age1, int weight1, double income1 ) {
		// TODO Auto-generated constructor stub
		age = age1;
		weight =weight1;
		income =income1;
	
	
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
