package muthu_sir_String;

public class Split_String_Store_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "arun siva john deva mani";
String key=" ";   
int count=1;
for(int i=0;i<name.length();i++) {
	if (name.charAt(i)==key.charAt(0)) {
		count++;
	}
}
String b[]=new String[count];
String Temp="";
int j=0;
for(int i=0;i<name.length();i++) {
	if(name.charAt(i)==key.charAt(0)) {
		b[j]=Temp;
		Temp="";
		j++;
		continue;
	}
	Temp=Temp+name.charAt(i);
}
b[j]=Temp;
//for(String s:b)   if for each loop means 
	for (int i=0;i<b.length;i++)	{
   System.out.println(b[i]);

	}
	}}

