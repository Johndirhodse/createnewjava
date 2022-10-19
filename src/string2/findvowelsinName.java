package string2;

public class findvowelsinName {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		String name="JOHNDIRHODES";
	    name=name.toLowerCase();
  for(int i=0;i<name.length();i++)
  {
	  char c=name.charAt(i);
	       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
	    	   System.out.println(c);
	       }
	  
  }
	}

}
