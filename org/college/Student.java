package week3.day1.org.college;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("student name:"+ "sakthepriya");
	}

	public void studentDept()
	{
		System.out.println("studentDept:"+ "ECE");
	}
	public void studentId()
	{
		System.out.println("studentId:"+ "41");
	}
	public static void main(String[] args)
	{
		Student info=new Student();
		info.collegeName();
		info.collegecode();
		info.collegerank();
		info.deptName();
		info.studentName();
		info.studentDept();
		info.studentId();
	}
}
