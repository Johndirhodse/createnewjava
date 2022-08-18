package createnewjava;
import java.util.Scanner;
public class IFORELSE {

	public static void main(String... args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner f=new Scanner(System.in);
System.out.println("enter two number");
a=f.nextInt();
b=f.nextInt();
System.out.println("enter one for addition");
System.out.println("enter two for multiplication");
System.out.println("enter three for subtraction");
c=f.nextInt();
if(c==1)
System.out.println("addition is "+ a+b);
else if(c==3)
	System.out.println("subtraction is " +(a-b));

else 
	System.out.println("multiplication is "+a*b);
	}

}
