package muthu_sir;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0,num2=1;
while(num1<=13) {
	System.out.println(num1);
	num2=num1+num2;
	num1=num2-num1;
}
	}

}
