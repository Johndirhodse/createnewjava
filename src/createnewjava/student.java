package createnewjava;

public class student {
	int rollno;
	String name;
	int mark;
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(mark);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	student s1=new student();
	s1.rollno=101;
	s1.name="john";
	s1.mark=50;
	s1.display();


	student s2=new student();
	s2.rollno=103;
	s2.name="arun";
	s2.mark=70;
	s2.display();
		}

	}
