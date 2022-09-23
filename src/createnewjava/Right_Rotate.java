package createnewjava;

public class Right_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int b=a[a.length-1];
for (int i=4;i>0;i--) { 
	a[i]=a[i-1];
	System.out.print(a[i]);
}
	}

}
