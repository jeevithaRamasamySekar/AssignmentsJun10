package learnoverload;

public class Student
{
	public void studentInfo(int id)
	{
System.out.println("Student id is"+" "+id);
}
	public void studentInfo(int id, String name)
	{
System.out.println("Student id and name is"+" "+id+" "+name);
}
	public void studentInfo(String email,long ph)
	{
System.out.println("Student email  is"+" "+email+" "+"phone no "+ph);
}
	public static void main(String[] args) {
		Student st=new Student();
		st.studentInfo(1);
		st.studentInfo(2, "Shashvath");
		st.studentInfo("jeeviaish@gmail.com", 1234444498);
		
	}
	}
