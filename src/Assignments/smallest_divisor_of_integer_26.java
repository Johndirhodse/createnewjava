package Assignments;

public class smallest_divisor_of_integer_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=55;
		int i=0;
		for(i=2;i<=n;i++){
			if(n%i==0)
				{
					if(i==2||i==3||i==5||i==7)
						System.out.println(i);
				break;
				}}
	}

}
