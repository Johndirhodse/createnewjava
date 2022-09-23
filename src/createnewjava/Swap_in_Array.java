package createnewjava;

public class Swap_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[]= {1,2,3,7,6};
int b=a[4];
a[4]=a[3];
a[3]=a[2];
a[2]=a[1];
a[1]=a[0];
a[0]=b;
System.out.print(a[0]);
System.out.print(a[1]);
System.out.print(a[2]);
System.out.print(a[3]);
System.out.print(a[4]);
		
		
		
		
	}}


