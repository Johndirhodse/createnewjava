package oops;

public class largestnumber {
 void add( int a,int b)
 {
	 if (a>b){
	 System.out.println(a);}
	 else if (b>a) {
	 System.out.println(b);
	 }
 }
 void add(int a,int b,int c)
 {
	 if(a>b && a>c) 
		System.out.println(a);
	 else if(b>a && b>c)
	    System.out.println(b);
	 else 
		System.out.println(c);
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestnumber s= new largestnumber();
		s.add(74, 135);
		s.add(55, 44, 240);
		System.out.println("welcome");
	}

}
