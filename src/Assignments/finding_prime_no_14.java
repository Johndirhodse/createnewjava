package Assignments;

public class finding_prime_no_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=83;
		int m=2;
		boolean prime=true;
		while(m<n)
		{
			if(n%m==0)
				prime=false;
				m++;
		}
		if(prime==true)
			System.out.println(" prime Number");
		else 
			System.out.println("not prime Number");
	}

}
