package string;

public class Return_maxvalue {
int max (int a,int b,int c) {
	if(a>b && a>c)
	 return a;
	 else if(b>c)
	 return b;
	 else
	  return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Return_maxvalue a =new Return_maxvalue();
System.out.print(a.max(22, 88, 13));
	}

}
