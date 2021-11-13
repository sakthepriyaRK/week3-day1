package week3.day1.javastrings;

public class StringComparisonEquals {
public static void main(String[] args) {
	String s1="I am Learning Java";
	String s2="I am learning java?";
	if(s1.equals(s2))
	{
		System.out.println("same content");
}
	
	else if(s1==s2)
	{
		System.out.println("diff memory");
}
	else if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("same irr of case");
}
	else
	{System.out.println("diff");
	}
	
	}

}
