import java.util.Scanner;
public class even {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]List= new int[5];
		Scanner Scanner= new Scanner(System.in);
		System.out.print("Enter 5 different numbers");
		
		List[0]=Scanner.nextInt();
        List[1] =Scanner.nextInt();
        List[2]=Scanner.nextInt();
        List[3] =Scanner.nextInt();
        List[4]=Scanner.nextInt();
        
        
        for (int i=0; i<List.length;i++)
    	{
    		if (List[i]%2==0)
        {
    			System.out.println ("Even");
        }
    		else System.out.println ("Odd");
    	}
    }}
        
        
        
        

