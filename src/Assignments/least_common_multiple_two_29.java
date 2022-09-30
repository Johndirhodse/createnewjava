package Assignments;

public class least_common_multiple_two_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		int j=9;
		int sum;
		int g=0;
		for(int k=1;k<=i;k++) {
			if(i%k==0&&j%k==0)
				g=k;
		}
		sum=i*j/g;
		System.out.println(sum);
	
	}

}
