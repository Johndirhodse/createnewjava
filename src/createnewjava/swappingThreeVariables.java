package createnewjava;

public class swappingThreeVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=3;
int c=7;
System.out.println("Before swapping ");
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);
a=a+b;
b=a-b;
a=a-b;
b=b+c;
c=b-c;
b=b-c;
System.out.println("After swapping ");
System.out.println("A="+a);
System.out.println("B="+b);
System.out.println("C="+c);

	} 

}
