package week3.day1.students;

public class Students 
{
	public void getstudentsinfo(int id)
	{
		System.out.println("id:"+id);
		;
	}
	public void getstudentsinfo(String name)
	{
		System.out.println("name:"+name);
	}
	
	public void getstudentsinfo(long phone,String email)
	{
		System.out.println("phone:"+phone+"email:"+email);
	}
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getstudentsinfo(1080);
		stud.getstudentsinfo("sakthe");
		stud.getstudentsinfo(123456779999l, "sak@gmail.com");
		
	}
}
