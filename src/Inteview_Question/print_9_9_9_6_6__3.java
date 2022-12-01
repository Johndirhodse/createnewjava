package Inteview_Question;

public class print_9_9_9_6_6__3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int m=4;
 int d=m;
 for(int i=1;i<=m;i++) {
	 for(int j=1;j<i;j++) {
		 System.out.print(" ");
	 }
	 for(int k=(m+1)-i;k>=1;k--) {
		 System.out.print(d*3+" ");
	 }d--;
	 System.out.println();
	 
 }
	}

}
