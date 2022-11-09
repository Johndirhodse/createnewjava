package muthu_sir_STAR_pattern;

public class print_ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alp='A';
		for (int row = 1; row <= 5; row++) {
			for (int col = row; col <=5; col++) {
				System.out.print(" ");
			}
			
			for (int star = 5; star >=6-row; star--) {
				System.out.print(alp+"");
				alp++;
			}
			System.out.println();
			}
			
		}
	}


