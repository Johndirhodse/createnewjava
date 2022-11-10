package muthu_sir_STAR_pattern;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((j==1)||(j==10)||(i==j-0))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
