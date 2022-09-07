package createnewjava;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=9857,t,r=0,reverse=0;
	t=num;
	while(num>0)
	{
	t=num%10;
	num=num/10;
	reverse=(reverse*10)+t;
	r=r+t;
	
	
	}
	System.out.println(r);
	System.out.println(reverse);
	}

}
