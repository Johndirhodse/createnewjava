package Assignments;

public class square_root_of_giv_num_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=64;
		int i=2;
		while(i<=n/2) {
			if((n/i)==i) {
				System.out.println(i+" is the square root of "+n);
				break;
		}
		i++;	
		}
	}

}
