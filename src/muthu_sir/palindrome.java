package muthu_sir;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=34543;
int reverse=0;
int num2=num;
while(num>0) {
	int reminder=num%10;
	reverse=(reverse*10)+reminder;
	num=num/10;
}
System.out.print(reverse);
if(num2==reverse)
	System.out.print(" "+"palindrome");
else
	System.out.print("not a palindrome");
	
	}

}
