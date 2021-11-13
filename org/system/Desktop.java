package week3.day1.org.system;

public class Desktop extends Computer {
	public void desktopsize()
	{
	System.out.println("the size of desktop:"+ "24'");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computermodel();
		desk.desktopsize();
	}

}
