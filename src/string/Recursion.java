package string;

public class Recursion {
void m1(int n)
{
	System.out.println(n);
	n++;
	if(n<=5)
	{
		m1(n);
	}
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion s=new Recursion();
		s.m1(1);
	}

}
