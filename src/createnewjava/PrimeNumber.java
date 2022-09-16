package createnewjava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=31,t=0;
for(int i=2;i<n;i++)
{
	if(n%i==0) {
		t=t+1;
	}
}if (t==0)
{
	System.out.println("prime");
}else
{
	System.out.println("not prime");
}
	}}
	