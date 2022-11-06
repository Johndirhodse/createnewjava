package muthu_sir;

public class reverseTheOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;                       //123  12
int reverse=0;
while(num>0) {
int reminder=num%10;           //4      /3
reverse=(reverse*10)+reminder; //0*10+4 /4*10+3=43 
num=num/10;                    //123    /12
}
System.out.print(reverse);     //4      /43
	}

}
