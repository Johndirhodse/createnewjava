package Assignments;

public class Finding_first_20_prime_no15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int i, j, num;
	      
	      System.out.println("Prime Numbers from 1 to 20");
	      for(i=2; i<=20; i++)
	      {
	         num = 0;
	         for(j=2; j<i; j++)
	         {
	            if(i%j==0)
	            {
	               num++;
	               break;
	            }
	         }
	         if(num==0)
	            System.out.println(i);
	      }
	}

}
