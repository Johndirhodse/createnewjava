package createnewjava;

public class Reverse_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7589,reverse=0;
while(n>0)
{
   int reminder=n%10;
	n=n/10;
	reverse=reverse*10+reminder;
}
	System.out.println(reverse);
}
	}


