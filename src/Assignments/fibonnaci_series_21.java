package Assignments;

public class fibonnaci_series_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=-1;
		int n2=1;
		int n3;
		int e=0;
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			e=e+n3;
		
		}
		System.out.println("total value of fibonacci ="+e);
	}

	}


