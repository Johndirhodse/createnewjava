package createnewjava;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f=-1;
int s=1;
		for(int i=1;i<=7;i++)
		{
			System.out.println(f+s);
			s=f+s;
			f=s-f;
		}
	}

}
