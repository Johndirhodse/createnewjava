package online_class_Nov17;

public class GIVEN_ELEMENT_PRESENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]values= {20,30,20,40,70,20,90};
int num=20;
int count =0;
for(int i=0;i<values.length;i++) {
	if(values[i]==num) {
		count++;
	}
}
System.out.print(num+"is present "+count+"times");
	}

}
