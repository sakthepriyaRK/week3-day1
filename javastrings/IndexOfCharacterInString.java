package week3.day1.javastrings;

public class IndexOfCharacterInString {
	public static void main(String[] args)
	{
		String str="Java Exercise";
		char[] ch=str.toCharArray();
		int l=ch.length;int count=0;
		for(int i=0;i<l;i++)
		{ count++;
		int length=count;
		int index=count-1;
		if(ch[i]=='E')
		{ 
			System.out.println("Length of the character:"+length);
			System.out.println("index of the character:"+index);
		}
		else if(ch[i]=='s')
		{
			System.out.println("Length of the character:"+length);
			System.out.println("index of the character:"+index);
		}
		
		}
}

}
