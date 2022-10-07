package Assignment2Array;

public class CopyoddIndex23 {
void odd (int a[]) {
	int b[]=new int [a.length];
	for (int i=0;i<a.length;i+=2) {
		//if (i%2!=0) {
			b[i]=a[i];
			System.out.println("index"+i+"= "+b[i]);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int k[]= {1,2,3,4,5,6,7,8,9}; 
  CopyoddIndex23 s=new CopyoddIndex23();
  s.odd(k);

	}

}
