package Assignments;

public class greatest_common_divisor_of_two_integer_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=18;
		int j=36;
		for(int k=2;k<=j;k++) {
			if(i%k==0&&j%k==0)
				System.out.println(k);
		}

	}

}
